package com.qubaopen.survey.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.user.UserReceiveAddress;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.user.UserReceiveAddressRepository;

@RestController
@RequestMapping("userReceiveAddresses")
public class UserReceiveAddressController extends AbstractBaseController<UserReceiveAddress, Long> {

	@Autowired
	private UserReceiveAddressRepository userReceiveAddressRepository;

	@Override
	protected MyRepository<UserReceiveAddress, Long> getRepository() {
		return userReceiveAddressRepository;
	}

}
