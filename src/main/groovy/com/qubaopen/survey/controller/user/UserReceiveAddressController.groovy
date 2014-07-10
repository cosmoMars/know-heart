package com.qubaopen.survey.controller.user

import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.user.UserReceiveAddress
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.user.UserReceiveAddressRepository
import com.qubaopen.survey.repository.user.UserRepository

@RestController
@RequestMapping("userReceiveAddresses")
public class UserReceiveAddressController extends AbstractBaseController<UserReceiveAddress, Long> {

	@Autowired
	UserReceiveAddressRepository userReceiveAddressRepository

	@Autowired
	UserRepository userRepository

	@Override
	protected MyRepository<UserReceiveAddress, Long> getRepository() {
		return userReceiveAddressRepository
	}


	/**
	 * 保存收获地址
	 * @param receiveAddress
	 * @return
	 */
	@RequestMapping(value ="saveReceiveAddress", method = RequestMethod.POST)
	saveReceiveAddress(@RequestBody UserReceiveAddress receiveAddress) {

		def userId = receiveAddress.user.id

		def user = userRepository.findActivatedByUserId(userId)

		if (!user) {
			return '{"success": 0, "message": "err001"}'
		}

		def userReceiveAddress = userReceiveAddressRepository.findOneByFilters(
				[
					user_equal : user,
					isRemoved_isFalse : null
				]
			)

		if (userReceiveAddress) {
			BeanUtils.copyProperties(receiveAddress, userReceiveAddress)
		} else {
			userReceiveAddress = new UserReceiveAddress()
			BeanUtils.copyProperties(receiveAddress, userReceiveAddress)
		}
		userReceiveAddressRepository.save(userReceiveAddress)
		return '{"success": 1}'

	}

}
