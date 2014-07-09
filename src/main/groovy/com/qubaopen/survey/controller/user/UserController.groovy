package com.qubaopen.survey.controller.user

import static com.qubaopen.survey.utils.ValidateUtil.*

import org.apache.commons.codec.digest.DigestUtils
import org.apache.commons.lang3.RandomStringUtils
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.fasterxml.jackson.databind.ObjectMapper
import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.user.User
import com.qubaopen.survey.entity.user.UserCaptcha
import com.qubaopen.survey.entity.user.UserChatSend;
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.user.UserCaptchaRepository
import com.qubaopen.survey.repository.user.UserRepository
import com.qubaopen.survey.service.SmsService
import com.qubaopen.survey.utils.CommonValues

/**
 * @author mars 用户表
 */
@RestController
@RequestMapping('users')
class UserController extends AbstractBaseController<User, Long> {

	@Autowired
	UserRepository userRepository

	@Autowired
	UserCaptchaRepository userCaptchaRepository

	@Autowired
	SmsService smsService

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


		logger.trace ' -- 用户登录 -- '

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

		logger.trace ' -- 用户注册 -- '

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
	 * @return 给用户手机发一条验证码短信
	 */
	@RequestMapping(value = 'sendCaptcha', method = RequestMethod.GET)
	sendCaptcha(@RequestParam String phone) {

		logger.trace ' -- 发送验证码 -- '

		logger.trace "phone := $phone"

		if (!validatePhone(phone)) { // 验证用户手机号是否无效
			return '{"success" : 0, "message": "手机号码为空或格式不正确"}'
		}

		def user = userRepository.findByPhone(phone)
		if (!user) {
			return '{"success": 0, "message": "该号码还未注册，请先注册"}'
		}
		if (user.activated) {
			return '{"success": 0, "message": "该号码已经验证，请登录"}'
		}

		// 生成6位数字格式的验证码
		def captcha = RandomStringUtils.randomNumeric(6)
		// 给指定的用户手机号发送6位随机数的验证码
		def success = smsService.sendCaptcha(phone, captcha)
		if (!success) {
			return '{"success": 0, "message": "短信验证码发送失败"}'
		}

		def userCaptcha = userCaptchaRepository.findByUserId(user.id)
		if (!userCaptcha) { // 新注册用户，没验证码
			userCaptcha = new UserCaptcha(
				user: user,
				captcha: captcha
			)
			userCaptchaRepository.save(userCaptcha)
			return '{"success": 1}'
		}
		
		// 底下的代码应该放在验证的接口才做吧！！！

		/*def curTime = new Date()
		def captchaDate = userCaptcha.lastCheckedDate

		if ((curTime.time - captchaDate.time) < 60000) {
			return '{"success": 0, "message": "错误原因：二次验证间隔时间过短，请耐心等待一分钟再试"}'
		}
		if (userCaptcha.verifyNum >= CommonValues.VERIFYNUM) {
			return '{"success": 0, "message": "错误原因：验证次数过多，请等待或者明天再试"}'
		}
		userCaptcha.user = user
		userCaptcha.captcha = captcha
		userCaptcha.lastCheckedDate = curTime

		if (DateUtils.isSameDay(curTime, captchaDate)) {
			userCaptcha.verifyNum = 0
		} else {
			userCaptcha.verifyNum++
		}

		userCaptchaRepository.save(userCaptcha)
		return '{"success": 1}'*/
	}


	/**
	 * 用户提交验证码
	 * @param phone
	 * @param captcha
	 * @return
	 */
	@RequestMapping(value = 'confirmCaptcha', method = RequestMethod.POST)
	confirmCaptcha(@RequestParam String phone, @RequestParam String captcha) {

		logger.trace(' -- 用户提交验证码 -- ')

		if (StringUtils.isEmpty(captcha)) {
			return '{"success": 0, "message": "验证码为空"}'
		}

		def user = userRepository.findByPhone(phone)
		if (!user) {
			return '{"success": 0, "message": "没有该用户"}'
		}

		def userCaptcha = userCaptchaRepository.findByUserId(user.id)

		if (!userCaptcha.captcha || userCaptcha.captcha.trim() =='') {
			return '{"success": 0, "message": "请重新申请验证码"}'
		}
		if (captcha != userCaptcha.captcha) {
			return '{"success": 0, "message": "输入验证码有误"}'
		}

		userCaptcha.captcha = null
		userCaptcha.verifyNum = 0
		userCaptchaRepository.save(userCaptcha)
		return '{"success": 1}'
	}

	/**
	 * 忘记密码重置
	 * @param phone
	 * @param password
	 * @param captcha
	 * @return
	 */
	@RequestMapping(value = 'resetPassword', method = RequestMethod.GET)
	resetPassword(@RequestParam String phone, @RequestParam String password, @RequestParam String captcha) {

		if (StringUtils.isEmpty(captcha)) {
			return '{"success": 0, "message": "验证码为空"}'
		}

		def user = userRepository.findByPhone(phone)

		if (!user) {
			return '{"success": 0, "message": "没有该用户"}'
		}

		def userCaptcha = userCaptchaRepository.findByUserId(user.id)

		if (userCaptcha) {
			if (userCaptcha == captcha) {
				if (!validatePwd(password)) {
					return '{"success": 0, "message": "err002"}'
				}
				
				user.password = DigestUtils.md5Hex(password)
				userRepository.save(user)
		
				userCaptcha.captcha = null
				userCaptchaRepository.save(userCaptcha)
		
				return '{"success": 1, "message": "密码设置成功"}'
			}else {
				return '{"success": 0, "message": "输入验证码有误"}'
			}
		}else {
			return '{"success": 0, "message": "请重新申请验证码"}'
		}
	}

}