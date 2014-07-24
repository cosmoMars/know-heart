package com.qubaopen.survey.repository.interest;

import java.util.List;

import com.qubaopen.survey.entity.interest.Interest;
import com.qubaopen.survey.entity.interest.InterestQuestion;
import com.qubaopen.survey.repository.MyRepository;

public interface InterestQuestionRepository extends MyRepository<InterestQuestion, Long> {

	List<InterestQuestion> findByInterest(Interest interest);
}
