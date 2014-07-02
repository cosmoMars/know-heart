package com.qubaopen.survey.controller.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.survey.SurveyUserQuestion;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.survey.SurveyUserQuestionRepository;

@RestController
@RequestMapping("surveyUserQuestions")
public class SurveyUserQuestionController extends AbstractBaseController<SurveyUserQuestion, Long> {

	@Autowired
	private SurveyUserQuestionRepository surveyUserQuestionRepository;

	@Override
	protected MyRepository<SurveyUserQuestion, Long> getRepository() {
		return surveyUserQuestionRepository;
	}

}
