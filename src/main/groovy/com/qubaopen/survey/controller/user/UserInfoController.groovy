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


		Map<String, String> result = new HashMap<>()

		if (userInfo) {
			result.put('sex', userInfo.sex)
			result.put('birthday', userInfo.birthday)
			result.put('bloodType', userInfo.birthday)
			if (userInfo.user.email) {
				result.put('email', userInfo.user.email)
			}
		}

		if (userIdCardBind) {
			result.put('IDCard', userIdCardBind.userIDCard.IDCard)
		}
		if (defaultAddress) {
			result.put('defaultAddress', defaultAddress.detialAddress)
		}

		return objectMapper.writeValueAsString(result)

	}

}
