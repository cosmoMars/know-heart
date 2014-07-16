package com.qubaopen.survey.controller.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.user.UserInfo
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.user.UserIDCardBindRepository
import com.qubaopen.survey.repository.user.UserInfoRepository
import com.qubaopen.survey.repository.user.UserReceiveAddressRepository
import com.qubaopen.survey.repository.user.UserRepository

@RestController
@RequestMapping("userInfos")
public class UserInfoController extends AbstractBaseController<UserInfo, Long> {

	@Autowired
	UserInfoRepository userInfoRepository

	@Autowired
	UserRepository userRepository

	@Autowired
	UserIDCardBindRepository userIDCardBindRepository

	@Autowired
	UserReceiveAddressRepository userReceiveAddressRepository

	@Override
	protected MyRepository<UserInfo, Long> getRepository() {
		userInfoRepository
	}

	@RequestMapping(value = 'getTotalInfo', method = RequestMethod.GET)
	getTotalInfo(@RequestParam long userId) {

		def userIdCardBind = userIDCardBindRepository.findByUserId(userId)

		def userInfo = userInfoRepository.findOne(userId)

		def defaultAddress = userReceiveAddressRepository.findDefaultAddressByUserId(userId)


		def result = [
				'userId': userId,
				'sex': userInfo.sex ?: '',
				'birthday': userInfo?.birthday ?: '',
				'bloodType': userInfo?.bloodType ?: '',
				'email': userInfo.user.email ?: '',
				'defaultAddress': defaultAddress.detialAddress ?: '',
				'IDCard': userIdCardBind?.userIDCard?.IDCard ?: ''
			]

		return objectMapper.writeValueAsString(result)
	}
}