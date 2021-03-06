package com.qubaopen.survey.controller.reward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.reward.RewardAssignRecord;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.reward.RewardAssignRecordRepository;

@RestController
@RequestMapping("rewardAssignRecords")
public class RewardAssignRecordController extends AbstractBaseController<RewardAssignRecord, Long> {

	@Autowired
	private RewardAssignRecordRepository rewardAssignRecordRepository;

	@Override
	protected MyRepository<RewardAssignRecord, Long> getRepository() {
		return rewardAssignRecordRepository;
	}

}
