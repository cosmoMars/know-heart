package com.qubaopen.survey.controller.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.user.UserReceiveAddress
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.user.UserReceiveAddressRepository
import com.qubaopen.survey.service.user.UserReceiveAddressService

@RestController
@RequestMapping('userReceiveAddresses')
public class UserReceiveAddressController extends AbstractBaseController<UserReceiveAddress, Long> {

	@Autowired
	UserReceiveAddressRepository userReceiveAddressRepository

	@Autowired
	UserReceiveAddressService userReceiveAddressService

	@Override
	protected MyRepository<UserReceiveAddress, Long> getRepository() {
		userReceiveAddressRepository
	}

	@Override
	@RequestMapping(value = 'add', method = RequestMethod.POST)
	add(@RequestBody UserReceiveAddress userReceiveAddress) {

		def userId = userReceiveAddress.user.id

		def addressList = userReceiveAddressRepository.findByUserId(userId)
		if (!addressList) {
			userReceiveAddress.default = true
		}

		super.add(userReceiveAddress)
	}

	@Override
	@RequestMapping(value ='delete', method = RequestMethod.DELETE)
	delete(@RequestParam long id) {

		userReceiveAddressService.deleteById(id)
	}

}
