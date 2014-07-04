package com.qubaopen.survey.controller.user;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.user.User;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.user.UserRepository;

//@RestController
//@RequestMapping("user")
public class UserControllerBack extends AbstractBaseController<User, Long> {

	@Autowired
	private UserRepository userRepository;

	@Override
	protected MyRepository<User, Long> getRepository() {
		return userRepository;
	}

	@RequestMapping(value = "/login", method = RequestMethod.PUT)
	public Object login(@RequestBody User user) {

		String phone = user.getPhone(), password = user.getPassword();

		User logedUser = userRepository.login(phone, DigestUtils.md5Hex(password));

		if (logedUser != null) {
			return "{\"success\": false}";
		} else if (!logedUser.isActivated()) {
			return "{\"success\": false}";
		}
		return logedUser;
	}

}
