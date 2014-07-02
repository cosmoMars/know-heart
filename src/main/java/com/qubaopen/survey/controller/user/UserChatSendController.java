package com.qubaopen.survey.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.user.User;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.user.UserRepository;

@RestController
@RequestMapping("userChatSends")
public class UserChatSendController extends AbstractBaseController<User, Long> {

	@Autowired
	private UserRepository repositoryUserRepository;

	@Override
	protected MyRepository<User, Long> getRepository() {
		return repositoryUserRepository;
	}

}
