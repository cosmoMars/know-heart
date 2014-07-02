package com.qubaopen.survey.controller.reward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.reward.RewardUser;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.reward.RewardUserRepository;

@RestController
@RequestMapping("rewardUsers")
public class RewardUserController extends AbstractBaseController<RewardUser, Long> {

	@Autowired
	private RewardUserRepository rewardUserRepository;
	
	@Override
	protected MyRepository<RewardUser, Long> getRepository() {
		return rewardUserRepository;
	}

}
