package com.qubaopen.survey.repository.reward;

import java.util.List;

import com.qubaopen.survey.entity.reward.RewardActivityRecord;
import com.qubaopen.survey.entity.user.User;
import com.qubaopen.survey.repository.MyRepository;

public interface RewardActivityRecordRepository extends MyRepository<RewardActivityRecord, Long> {

	long countByUser(User user);

	List<RewardActivityRecord> findAllByUserId(long userId);
}
