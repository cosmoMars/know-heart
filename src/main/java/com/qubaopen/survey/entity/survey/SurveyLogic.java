package com.qubaopen.survey.entity.survey;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 调研问卷 问题 顺序 （逻辑） Created by duel on 2014/6/26.
 */

@Entity
@Table(name = "SURVEY_LOGIC")
public class SurveyLogic extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 2483392548204300813L;

	/**
	 * 从属的组
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private SurveyLogicGroup surveyLogicGroup;

	/**
	 * 问卷题目 本题id
	 */
	private SurveyQuestion surveyQuestion;

	/**
	 * 题目选择的选项
	 */
	private SurveyQuestionOption surveyQuestionOption;

	public SurveyLogicGroup getSurveyLogicGroup() {
		return surveyLogicGroup;
	}

	public void setSurveyLogicGroup(SurveyLogicGroup surveyLogicGroup) {
		this.surveyLogicGroup = surveyLogicGroup;
	}

	public SurveyQuestion getSurveyQuestion() {
		return surveyQuestion;
	}

	public void setSurveyQuestion(SurveyQuestion surveyQuestion) {
		this.surveyQuestion = surveyQuestion;
	}

	public SurveyQuestionOption getSurveyQuestionOption() {
		return surveyQuestionOption;
	}

	public void setSurveyQuestionOption(SurveyQuestionOption surveyQuestionOption) {
		this.surveyQuestionOption = surveyQuestionOption;
	}

}