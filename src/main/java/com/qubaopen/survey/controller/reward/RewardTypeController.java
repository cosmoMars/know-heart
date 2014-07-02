package com.qubaopen.survey.controller.reward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.reward.RewardType;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.reward.RewardTypeRepository;

@RestController
@RequestMapping("rewardTypes")
public class RewardTypeController extends AbstractBaseController<RewardType, Long> {

	@Autowired
	private RewardTypeRepository rewardTypeRepository;
	
	@Override
	protected MyRepository<RewardType, Long> getRepository() {
		return rewardTypeRepository;
	}

}
