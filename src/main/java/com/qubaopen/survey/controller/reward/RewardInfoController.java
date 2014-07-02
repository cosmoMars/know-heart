package com.qubaopen.survey.controller.reward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.reward.RewardInfo;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.reward.RewardInfoRepository;

@RestController
@RequestMapping("rewardInfos")
public class RewardInfoController extends AbstractBaseController<RewardInfo, Long> {

	@Autowired
	private RewardInfoRepository rewardInfoRepository;
	
	@Override
	protected MyRepository<RewardInfo, Long> getRepository() {
		return rewardInfoRepository;
	}

}
