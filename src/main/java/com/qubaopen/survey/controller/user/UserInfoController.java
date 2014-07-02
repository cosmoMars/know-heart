package com.qubaopen.survey.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.user.UserInfo;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.user.UserInfoRepository;

@RestController
@RequestMapping("userInfos")
public class UserInfoController extends AbstractBaseController<UserInfo, Long> {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Override
	protected MyRepository<UserInfo, Long> getRepository() {
		return userInfoRepository;
	}

}
