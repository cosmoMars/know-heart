package com.qubaopen.survey.service.reward

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.qubaopen.survey.entity.reward.RewardActivity
import com.qubaopen.survey.entity.reward.RewardActivityRecord
import com.qubaopen.survey.entity.user.UserGold
import com.qubaopen.survey.entity.user.UserReceiveAddress
import com.qubaopen.survey.repository.reward.RewardActivityRecordRepository
import com.qubaopen.survey.repository.user.UserGoldRepository

@Service
public class RewardActivityRecordService {

	@Autowired
	UserGoldRepository userGoldRepository

	@Autowired
	RewardActivityRecordRepository recordRepository

	@Transactional
	saveRecordAndGold(RewardActivity rewardActivity, UserGold userGold, UserReceiveAddress userReceiveAddress ) {

		userGold.currentGold = userGold.currentGold - rewardActivity.requireGold
		userGoldRepository.save(userGold)

		def user = userGold.user,
			rewardActivityRecord =  new RewardActivityRecord(
				user: user,
				rewardActivity: rewardActivity,
				userReceiveAddress: userReceiveAddress,
				status: RewardActivityRecord.Status.PROCESSING
			)

		recordRepository.save(rewardActivityRecord)

	}
}
