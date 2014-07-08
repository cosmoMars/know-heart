package com.qubaopen.survey.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.user.UserCaptcha;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.user.UserCaptchaRepository;

@RestController
@RequestMapping("userCaptchas")
public class UserCaptchaController extends AbstractBaseController<UserCaptcha, Long> {

	@Autowired
	private UserCaptchaRepository userCaptchaRepository;

	@Override
	protected MyRepository<UserCaptcha, Long> getRepository() {
		return userCaptchaRepository;
	}

}
