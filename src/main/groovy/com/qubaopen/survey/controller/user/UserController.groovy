package com.qubaopen.survey.controller.user

import static com.qubaopen.survey.repository.util.ValidateUtil.*

import org.apache.commons.codec.digest.DigestUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.user.User
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.user.UserRepository

/**
 * @author mars 用户表
 */
@RestController
@RequestMapping('users')
class UserController extends AbstractBaseController<User, Long> {

	@Autowired
	UserRepository userRepository

	@Override
	protected MyRepository<User, Long> getRepository() {
		return userRepository
	}

	@RequestMapping(value='/login', method = RequestMethod.PUT)
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

	@RequestMapping(value ='/register', method = RequestMethod.POST)
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
	
	@RequestMapping(value = '/validateCheckCode', method = RequestMethod.PUT)
	validateCheckCode(@RequestBody User user){
		
	
	}
	
}