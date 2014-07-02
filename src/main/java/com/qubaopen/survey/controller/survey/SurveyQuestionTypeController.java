package com.qubaopen.survey.controller.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.survey.SurveyQuestionType;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.survey.SurveyQuestionTypeRepository;

@RestController
@RequestMapping("surveyQuestionTypes")
public class SurveyQuestionTypeController extends AbstractBaseController<SurveyQuestionType, Long> {

	@Autowired
	private SurveyQuestionTypeRepository surveyQuestionTypeRepository;

	@Override
	protected MyRepository<SurveyQuestionType, Long> getRepository() {
		return surveyQuestionTypeRepository;
	}

}
