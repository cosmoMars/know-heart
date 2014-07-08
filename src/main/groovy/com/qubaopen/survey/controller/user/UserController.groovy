package com.qubaopen.survey.controller.user

import static com.qubaopen.survey.utils.ValidateUtil.*
import groovy.transform.AutoClone;

import org.apache.commons.codec.digest.DigestUtils
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.user.User
import com.qubaopen.survey.entity.user.UserCaptcha
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.user.UserCaptchaRepository;
import com.qubaopen.survey.repository.user.UserRepository
import com.qubaopen.survey.service.SmsService
import com.qubaopen.survey.utils.CommonValues;
import com.qubaopen.survey.utils.DateUtils;

/**
 * @author mars 用户表
 */
@RestController
@RequestMapping('users')
class UserController extends AbstractBaseController<User, Long> {

	@Autowired
	UserRepository userRepository

	@Autowired
	SmsService smsService

	@Autowired
	UserCaptchaRepository userCaptchaRepository

	@Autowired
	ObjectMapper objectMapper;

	@Override
	protected MyRepository<User, Long> getRepository() {
		return userRepository
	}

	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	@RequestMapping(value='login', method = RequestMethod.PUT)
	login(@RequestBody User user) {


		logger.trace ' -- 用户登录 '

		def logedUser = userRepository.login(user.phone,  DigestUtils.md5Hex(user.password))

		//		logedUser = userRepository.findOneByFilters(
		//			[
		//				phone_equal : '13123456710',
		//				password_equal: DigestUtils.md5Hex(user.password),
		//				isActivated_isTrue: null,
		//				isRemoved_isFalse: null
		//			]
		//		);

		if (!logedUser) {
			return '{"success" : 0, "message": "xxxxx"}'
		}

		logedUser
	}

	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@RequestMapping(value ='register', method = RequestMethod.POST)
	register(@RequestBody User user) {

		logger.trace ' -- 用户注册 '

		def phone = user.phone
		if (!validatePhone(phone)) {
			return '{"success" : 0, "message": "111"}'
		}

		def registerUser = userRepository.findByPhone(phone)

		if (!registerUser) {
			return userRepository.save(user)
		}

	}

	/**
	 * @author blues
	 * @param phone 用户手机号
	 * @return 给手机发一条验证码短信
	 */
	@RequestMapping(value = 'sendCaptcha1', method = RequestMethod.GET)
	sendCaptcha1(@RequestParam String phone) {

		logger.trace "phone := $phone"
		println('captcha------------------'+ phone)

		// 给指定的用户手机号发送6位随机数的验证码
		def captcha = smsService.sendCaptcha(phone)

		def result = objectMapper.readValue(captcha, HashMap.class)

		println('result------------------'+ result.getAt('res_code'))

		println('captcha------------------'+ captcha)
	}


	/**
	 * @author mars
	 * @param phone 用户手机号
	 * @return 给手机发一条验证码短信
	 */
	@RequestMapping(value = 'sendCaptcha', method = RequestMethod.GET)
	sendCaptcha(@RequestParam String phone) {

		logger.trace "phone := $phone"

		if (!validatePhone(phone)) { // 验证用户手机号是否无效
			return '{"success" : 0, "message": "手机号码为空或格式不正确"}'
		}

		def user = userRepository.findByPhone(phone)

		if (!user) {
			return '{"success": 0, "message": "该号码还未注册，请先注册"}'
		}
		if (user.isActivated) {
			return '{"success": 0, "message": "该号码已经注册，请登录"}'
		}

		def userCaptcha = userCaptchaRepository.findByUser(user)

		// 生成验证码
		def captcha = RandomStringUtils.randomNumeric(6)
		// 给指定的用户手机号发送6位随机数的验证码
		def json = smsService.sendCaptcha(phone, captcha)

		def result = objectMapper.readValue(json, HashMap.class)

		if ('0' != result.getAt('res_code')) {
			return '{"success": 0, "message": "短信验证码发送失败"}'
		}

		// 新注册用户，没验证码
		if (!userCaptcha) {
			userCaptcha = new UserCaptcha()
			userCaptcha.setUser(user)
			userCaptcha.setLastCheckedDate(new Date())
			userCaptcha.setVerifyNum(1)
			userCaptcha.setCaptcha(captcha)
			userCaptchaRepository.save(userCaptcha)
			return '{"success": 1}'
		}

		def curTime = new Date()
		def captchaDate = userCaptcha.lastCheckedDate

		if ((curTime.time - captchaDate.time) < 60000) {
			return '{"success": 0,"message": "错误原因：发送间隔过短，请耐心等待一分钟再试"}'
		}
		if (userCaptcha.verifyNum >= CommonValues.CHECKNUM) {
			return '{"success": 0, "message": "错误原因：验证码发送次数过多，请等待或者明天再试"}'
		}
		userCaptcha.setUser(user)
		userCaptcha.setCaptcha(captcha)
		userCaptcha.setLastCheckedDate(curTime)
		if (DateUtils.isSameDay(curTime, captchaDate))
			userCaptcha.setVerifyNum(0)
		else
			userCaptcha.setVerifyNum(userCaptcha.verifyNum + 1)
		userCaptchaRepository.save(userCaptcha)

		return '{"success": 1}'
	}


	//	confirmCaptcha()

}