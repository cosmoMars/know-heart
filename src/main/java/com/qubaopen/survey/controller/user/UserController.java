package com.qubaopen.survey.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.user.User;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.user.UserRepository;

@RestController
@RequestMapping("users")
public class UserController extends AbstractBaseController<User, Long> {

	@Autowired
	private UserRepository userRepository;

	@Override
	protected MyRepository<User, Long> getRepository() {
		return userRepository;
	}

}
