package com.qubaopen.survey.repository.reward;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qubaopen.survey.entity.reward.Reward;
import com.qubaopen.survey.repository.MyRepository;

public interface RewardRepository extends MyRepository<Reward, Long> {

	@Query("from Reward r where r.id = :rewardId and r.isRemoved = false")
	Reward findByRewardId(@Param("rewardId") long rewardId);
	
}
