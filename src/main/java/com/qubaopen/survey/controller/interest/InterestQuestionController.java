package com.qubaopen.survey.controller.interest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.interest.InterestQuestion;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.interest.InterestQuestionRepository;

@RestController
@RequestMapping("interestQuestions")
public class InterestQuestionController extends AbstractBaseController<InterestQuestion, Long> {

	@Autowired
	private InterestQuestionRepository interestQuestionRepository;

	@Override
	protected MyRepository<InterestQuestion, Long> getRepository() {
		return interestQuestionRepository;
	}

}
