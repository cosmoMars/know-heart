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

	/**
	 * 新增收货地址
	 */
	@Override
	@RequestMapping(value = 'add', method = RequestMethod.POST)
	add(@RequestBody UserReceiveAddress userReceiveAddress) {

		logger.trace ' -- 新增收货地址 -- '

		def userId = userReceiveAddress.user.id,
			addressList = userReceiveAddressRepository.findAll(
				[
					'user.id_equal': userId
				]
			)
		if (addressList.size > 10) {
			return '{"success": 0, "message": "收获地址过多"}'
		}
		// 第一条记录保存
		if (!addressList) {
			userReceiveAddress.defaultAddress = true
			return super.add(userReceiveAddress)
		}
		// 不是默认地址保存
		if(!userReceiveAddress.defaultAddress) {
			return super.add(userReceiveAddress)
		}

		userReceiveAddressService.modifyAddress(userReceiveAddress)
	}

	/**
	 * 修改收货地址
	 */
	@Override
	@RequestMapping(value = 'modify', method = RequestMethod.PUT)
	modify(@RequestBody UserReceiveAddress userReceiveAddress) {

		logger.trace ' -- 修改收货地址 -- '

		if(!userReceiveAddress.defaultAddress) {
			return super.modify(userReceiveAddress)
		}

		def address = userReceiveAddressRepository.findOne(userReceiveAddress.id)

		if (address.defaultAddress == userReceiveAddress.defaultAddress) {
			return super.modify(userReceiveAddress)
		}

		userReceiveAddressService.modifyAddress(userReceiveAddress)

	}

	/**
	 * 删除收货地址
	 */
	@Override
	@RequestMapping(value ='delete', method = RequestMethod.DELETE)
	delete(@RequestParam long id) {

		logger.trace ' -- 删除收货地址 -- '

		def userReceiveAddress = userReceiveAddressRepository.findOne(id)

		if (!userReceiveAddress?.defaultAddress) {
			userReceiveAddressRepository.delete(userReceiveAddress)
			return
		}

		userReceiveAddressService.deleteDefaultAddress(userReceiveAddress)
	}

	/**
	 * 显示用户收货地址列表
	 */
	@Override
	@RequestMapping(value = 'findAll', method = RequestMethod.GET)
	findAll(@RequestParam long userId) {

		logger.trace ' -- 显示用户收货地址列表 -- '

		def addressList = userReceiveAddressRepository.findAll(
				[
					'user.id_equal' : userId
				]
			)

		def result = [
				'userId': userId,
				'addressList': addressList
			]

		result
	}
}
