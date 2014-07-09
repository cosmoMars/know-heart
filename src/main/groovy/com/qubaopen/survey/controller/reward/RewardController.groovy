package com.qubaopen.survey.controller.reward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.reward.Reward;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.reward.RewardRepository;

@RestController
@RequestMapping('rewards')
public class RewardController extends AbstractBaseController<Reward, Long> {

	@Autowired
	RewardRepository rewardRepository;

	@Override
	protected MyRepository<Reward, Long> getRepository() {
		return rewardRepository;
	}

	/**
	 * 通过id查询奖品
	 * @param rewardId
	 * @return
	 */
	@RequestMapping(value = 'viewReward', method = RequestMethod.GET)
	Reward viewReward(@RequestParam long rewardId){

		Reward reward = rewardRepository.findByRewardId(rewardId)

		reward
	}
}
