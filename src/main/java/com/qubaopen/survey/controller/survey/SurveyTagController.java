package com.qubaopen.survey.controller.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.survey.SurveyTag;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.survey.SurveyTagRepository;

@RestController
@RequestMapping("surveyTags")
public class SurveyTagController extends AbstractBaseController<SurveyTag, Long> {

	@Autowired
	private SurveyTagRepository surveyTagRepository;

	@Override
	protected MyRepository<SurveyTag, Long> getRepository() {
		return surveyTagRepository;
	}

}
