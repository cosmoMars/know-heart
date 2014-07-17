package com.qubaopen.survey.controller.reward

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.reward.RewardActivity
import com.qubaopen.survey.entity.reward.RewardActivityRecord
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.reward.RewardActivityRecordRepository
import com.qubaopen.survey.repository.reward.RewardActivityRepository
import com.qubaopen.survey.repository.user.UserGoldRepository
import com.qubaopen.survey.repository.user.UserReceiveAddressRepository
import com.qubaopen.survey.service.reward.RewardActivityRecordService

@RestController
@RequestMapping("rewardActivityRecords")
public class RewardActivityRecordController extends AbstractBaseController<RewardActivityRecord, Long> {

	@Autowired
	RewardActivityRecordRepository rewardActivityRecordRepository

	@Autowired
	RewardActivityRepository rewardActivityRepository

	@Autowired
	UserGoldRepository userGoldRepository

	@Autowired
	RewardActivityRecordService rewardActivityRecordService

	@Autowired
	UserReceiveAddressRepository userReceiveAddressRepository


	@Override
	protected MyRepository<RewardActivityRecord, Long> getRepository() {
		rewardActivityRecordRepository
	}

	/**
	 * 创建兑奖信息记录
	 * @param userId
	 * @param activityId
	 * @param addressId
	 * @return
	 */
	@RequestMapping(value = 'exchangeReward', method = RequestMethod.POST)
	exchangeReward(@RequestParam long userId, @RequestParam long activityId, @RequestParam long addressId) {

		def rewardActivity = rewardActivityRepository.findOne(activityId)

		if (!rewardActivity?.status != RewardActivity.Status.ONLINE) {
			return '{"success": 0, "message": "活动未上线或已结束"}'
		}

		if (rewardActivity.currentCount >= rewardActivity.totalCountLimit) {
			return '{"success": 0, "message": "该活动已售完"}'
		}

		def activityCount = rewardActivityRecordRepository.countBy(
				'user.id_equal': userId
			)

		if (activityCount >= rewardActivity.eachCountLimit) {
			return '{"success": 0, "message": "兑奖次数已用完"}'
		}

		def userGold = userGoldRepository.findByUserId(userId)

		if (userGold.currentGold < rewardActivity.requireGold) {
			return '{"success": 0, "message": "当前金币不足"}'
		}

		def address = userReceiveAddressRepository.findOne(addressId)

		rewardActivityRecordService.saveRecordAndGold(rewardActivity, userGold, address)
		'{"success": 1}'
	}
}
