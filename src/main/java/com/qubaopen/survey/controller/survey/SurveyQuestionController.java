package com.qubaopen.survey.controller.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.survey.SurveyQuestion;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.survey.SurveyQuestionRepository;

@RestController
@RequestMapping("surveyQuestions")
public class SurveyQuestionController extends AbstractBaseController<SurveyQuestion, Long> {

	@Autowired
	private SurveyQuestionRepository surveyQuestionRepository;

	@Override
	protected MyRepository<SurveyQuestion, Long> getRepository() {
		return surveyQuestionRepository;
	}

}
