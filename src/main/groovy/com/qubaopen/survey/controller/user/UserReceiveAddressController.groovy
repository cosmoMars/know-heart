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

		def addressList = userReceiveAddressRepository.findAll(
				[
					'user.id_equal': userId
				]
			)
		if (addressList.size > 10) {
			return '{"success": 0, "message": "收获地址过多"}'
		}

		if (!addressList) {
			userReceiveAddress.default = true
		}

		super.add(userReceiveAddress)
	}

//	@Override
//	@RequestMapping(value = 'modify', method = RequestMethod.PUT)
//	modify(@RequestBody UserReceiveAddress userReceiveAddress) {
//
//		return super.modify(userReceiveAddress)
//	}

	@Override
	@RequestMapping(value ='delete', method = RequestMethod.DELETE)
	delete(@RequestParam long id) {

		userReceiveAddressService.deleteById(id)
	}

	@Override
	@RequestMapping(value = 'findAll', method = RequestMethod.GET)
	findAll(@RequestParam long userId) {

		def addressList = userReceiveAddressRepository.findAll(
				[
					'user.id_equal' : userId
				]
			)

		def result = [
				'userId': userId,
				'addressList': addressList
			]
		objectMapper.writeValueAsString(result)
	}



}
