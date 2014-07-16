package com.qubaopen.survey.service.user

import javax.transaction.Transactional

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.qubaopen.survey.repository.user.UserReceiveAddressRepository

@Service
public class UserReceiveAddressService {

	@Autowired
	UserReceiveAddressRepository userReceiveAddressRepository

	@Transactional
	deleteById(long id) {
		def userReceiveAddress = userReceiveAddressRepository.findOne(id)

		if (!userReceiveAddress?.default) {
			userReceiveAddressRepository.delete(userReceiveAddress)
			return
		}
		def addressList = userReceiveAddressRepository.findByUserId(userReceiveAddress.user.id)

		if (addressList.size.is(1)) {
			userReceiveAddressRepository.delete(userReceiveAddress)
			return
		}
		addressList.remove(userReceiveAddress)
		userReceiveAddressRepository.delete(userReceiveAddress)
		addressList.get(0).default = true
		userReceiveAddressRepository.save(addressList)
	}
}
