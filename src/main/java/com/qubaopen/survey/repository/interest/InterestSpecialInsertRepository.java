package com.qubaopen.survey.repository.interest;

import java.util.List;

import com.qubaopen.survey.entity.interest.Interest;
import com.qubaopen.survey.entity.interest.InterestSpecialInsert;
import com.qubaopen.survey.repository.MyRepository;

public interface InterestSpecialInsertRepository extends MyRepository<InterestSpecialInsert, Long> {

	List<InterestSpecialInsert> findByInterest(Interest interest);
}
