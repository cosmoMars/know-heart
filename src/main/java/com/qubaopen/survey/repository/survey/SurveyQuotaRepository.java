package com.qubaopen.survey.repository.survey;

import java.util.List;

import com.qubaopen.survey.entity.survey.SurveyQuota;
import com.qubaopen.survey.repository.MyRepository;

public interface SurveyQuotaRepository extends MyRepository<SurveyQuota, Long> {

	 List<SurveyQuota> findAllByIsActivated(boolean isActivated);
}
