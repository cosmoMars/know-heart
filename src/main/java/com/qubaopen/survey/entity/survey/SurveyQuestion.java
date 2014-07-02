package com.qubaopen.survey.entity.survey;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * 调研问卷 问题 Created by duel on 2014/6/25.
 */
@Entity
@Table(name = "SURVEY_QUESTION")
public class SurveyQuestion extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 4209633666066983696L;

	/**
	 * 所从属的调研问卷
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Survey survey;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 编号
	 */
	private String serialNumber;

	/**
	 * 选项数量
	 */
	private Integer optionCount;

	/**
	 * 题目类型 选择 问答 排序 打分
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private SurveyQuestionType surveyQuestionType;

	/**
	 * 是否为性格题
	 */
	private Boolean isCharactered;

	/**
	 * 答题最短时间限制
	 */
	private Integer durationLimit;

	/**
	 * 最多选择数量限制
	 */
	private Integer selectionLimit;

	/**
	 * 该题目所从属的矩阵题
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private SurveyQuestionGroup surveyQuestionGroup;

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getOptionCount() {
		return optionCount;
	}

	public void setOptionCount(Integer optionCount) {
		this.optionCount = optionCount;
	}

	public SurveyQuestionType getSurveyQuestionType() {
		return surveyQuestionType;
	}

	public void setSurveyQuestionType(SurveyQuestionType surveyQuestionType) {
		this.surveyQuestionType = surveyQuestionType;
	}

	public Boolean getIsCharactered() {
		return isCharactered;
	}

	public void setIsCharactered(Boolean isCharactered) {
		this.isCharactered = isCharactered;
	}

	public Integer getSelectionLimit() {
		return selectionLimit;
	}

	public void setSelectionLimit(Integer selectionLimit) {
		this.selectionLimit = selectionLimit;
	}

	public SurveyQuestionGroup getSurveyQuestionGroup() {
		return surveyQuestionGroup;
	}

	public void setSurveyQuestionGroup(SurveyQuestionGroup surveyQuestionGroup) {
		this.surveyQuestionGroup = surveyQuestionGroup;
	}

	public Integer getDurationLimit() {
		return durationLimit;
	}

	public void setDurationLimit(Integer durationLimit) {
		this.durationLimit = durationLimit;
	}

}
