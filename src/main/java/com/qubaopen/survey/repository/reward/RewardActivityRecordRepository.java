package com.qubaopen.survey.repository.reward;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qubaopen.survey.entity.reward.RewardActivityRecord;
import com.qubaopen.survey.repository.MyRepository;

public interface RewardActivityRecordRepository extends MyRepository<RewardActivityRecord, Long> {

	@Query("from RewardActivityRecord rar where rar.user.id = :userId")
	List<RewardActivityRecord> findAllByUserId(@Param("userId") long userId);
}
