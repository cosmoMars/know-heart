package com.qubaopen.survey.controller.user

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
		
		def logedUser = userRepository.login user.phone, DigestUtils.md5Hex(user.password)
		
		if (!logedUser) {
			"{\"success\": false}"
		} else if (!logedUser.getIsActivated()) {
			"{\"success\": false}"
		} 
		
		logedUser
	}

}
