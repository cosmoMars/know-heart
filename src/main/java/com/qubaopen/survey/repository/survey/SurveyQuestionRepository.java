package com.qubaopen.survey.repository.survey;

import java.util.List;

import com.qubaopen.survey.entity.survey.Survey;
import com.qubaopen.survey.entity.survey.SurveyQuestion;
import com.qubaopen.survey.repository.MyRepository;

public interface SurveyQuestionRepository extends MyRepository<SurveyQuestion, Long> {

	List<SurveyQuestion> findAllBySurvey(Survey survey);

}
