package com.qubaopen.survey.controller.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.survey.Survey;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.survey.SurveyRepository;

@RestController
@RequestMapping("surveys")
public class SurveyController extends AbstractBaseController<Survey, Long> {

	@Autowired
	private SurveyRepository surveyRepository;

	@Override
	protected MyRepository<Survey, Long> getRepository() {
		return surveyRepository;
	}

}
