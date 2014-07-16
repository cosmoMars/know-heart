package com.qubaopen.survey.controller.reward

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.reward.RewardActivity
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.reward.RewardActivityRepository

@RestController
@RequestMapping("rewardActivitys")
public class RewardActivityController extends AbstractBaseController<RewardActivity, Long> {

	@Autowired
	RewardActivityRepository rewardActivityRepository

	@Override
	protected MyRepository<RewardActivity, Long> getRepository() {
		rewardActivityRepository
	}


	/**
	 * 获取上线奖品活动
	 * @return
	 */
	@RequestMapping(value = 'getOnlineReward', method = RequestMethod.GET)
	getOnlineReward() {

		def today = new Date()

		def rewardList = rewardActivityRepository.findAll(
				[
					startTime_greaterThan: today,
					endTime_lessThan: today,
					status_equal: 'ONLINE'
				]
			)
		rewardList
	}

}
