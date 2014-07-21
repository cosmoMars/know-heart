package com.qubaopen.survey.repository.reward;

import com.qubaopen.survey.entity.reward.Reward;
import com.qubaopen.survey.entity.reward.RewardInfo;
import com.qubaopen.survey.repository.MyRepository;

public interface RewardInfoRepository extends MyRepository<RewardInfo, Long> {

	RewardInfo findByRewardId(Reward reward);
}
