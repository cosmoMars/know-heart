package com.qubaopen.survey.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.user.UserCheckCode;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.user.UserCheckCodeRepository;

@RestController
@RequestMapping("userCheckCodes")
public class UserCheckCodeController extends AbstractBaseController<UserCheckCode, Long> {

	@Autowired
	private UserCheckCodeRepository userCheckCodeRepository;

	@Override
	protected MyRepository<UserCheckCode, Long> getRepository() {
		return userCheckCodeRepository;
	}

}
