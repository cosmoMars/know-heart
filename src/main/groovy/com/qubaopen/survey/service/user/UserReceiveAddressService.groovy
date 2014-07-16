package com.qubaopen.survey.service.user


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.qubaopen.survey.entity.user.UserReceiveAddress
import com.qubaopen.survey.repository.user.UserReceiveAddressRepository

@Service
public class UserReceiveAddressService {

	@Autowired
	UserReceiveAddressRepository userReceiveAddressRepository

	@Transactional
	deleteDefaultAddress(UserReceiveAddress address) {

		def addressList = userReceiveAddressRepository.findAll(
				[
					'user.id_equal': address.user.id
				]
			)

		if (addressList.size.is(1)) {
			userReceiveAddressRepository.delete(address)
			return
		}
		addressList.remove(address)
		userReceiveAddressRepository.delete(address)
		addressList.get(0).defaultAddress = true
		userReceiveAddressRepository.save(addressList.get(0))
	}

	@Transactional
	modifyAddress(UserReceiveAddress userReceiveAddress) {
		def addressList = userReceiveAddressRepository.findAll(
				[
					'user.id_equal': userReceiveAddress.user.id,
					isDefaultAddress_isTrue: null
				]
			)

		addressList.each {
			it.defaultAddress = false
		}

		addressList.add(userReceiveAddress)

		userReceiveAddressRepository.save(addressList)
	}
}
