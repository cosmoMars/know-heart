package com.qubaopen.survey.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.user.UserContactList;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.user.UserContactListRepository;

@RestController
@RequestMapping("userContactLists")
public class UserContactListController extends AbstractBaseController<UserContactList, Long> {

	@Autowired
	private UserContactListRepository userContactListRepository;

	@Override
	protected MyRepository<UserContactList, Long> getRepository() {
		return userContactListRepository;
	}

}
