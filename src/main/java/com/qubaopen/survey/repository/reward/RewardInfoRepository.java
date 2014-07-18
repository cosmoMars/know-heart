package com.qubaopen.survey.repository.reward;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qubaopen.survey.entity.reward.RewardInfo;
import com.qubaopen.survey.repository.MyRepository;

public interface RewardInfoRepository extends MyRepository<RewardInfo, Long> {

	@Query("from RewardInfo ri where ri.reward.id = :rewardId")
	RewardInfo findByRewardId(@Param("rewardId") long rewardId);
}
