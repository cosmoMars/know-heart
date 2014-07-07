package com.qubaopen.survey.controller.user

import static com.qubaopen.survey.utils.ValidateUtil.*

import org.apache.commons.codec.digest.DigestUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.user.User
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.user.UserRepository
import com.qubaopen.survey.service.SmsService

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

	@Override
	protected MyRepository<User, Long> getRepository() {
		return userRepository
	}

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
			return '{"success" : false, "message": "xxxxx"}'
		} 

		logedUser
	}

	@RequestMapping(value ='register', method = RequestMethod.POST)
	register(@RequestBody User user) {
		
		logger.trace ' -- 用户注册 '

		def phone = user.phone
		if (!validatePhone(phone)) {
			return '{"success" : false, "errorCode": "111"}'
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
	@RequestMapping(value = 'sendCaptcha', method = RequestMethod.GET)
	sendCaptcha(@RequestParam String phone) {
		
		logger.trace "phone := $phone"
		
		if (!validatePhone(phone)) { // 验证用户手机号是否无效
			return '{"success" : false, "errorCode": "xxxx"}'
		}
		
		// 给指定的用户手机号发送6位随机数的验证码
		smsService.sendCaptcha(phone)
	}
	
}