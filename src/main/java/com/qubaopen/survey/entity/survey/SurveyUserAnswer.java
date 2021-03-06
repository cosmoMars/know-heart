package com.qubaopen.survey.entity.survey;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 调研问卷 用户问卷 答题内容 Created by duel on 2014/6/26.
 */

@Entity
@Table(name = "survey_user_answer")
@Audited
public class SurveyUserAnswer extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -4958815591444663072L;

	/**
	 * 调研用户问卷
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "survey_user_questionnaire_id")
	private SurveyUserQuestionnaire surveyUserQuestionnaire;

	/**
	 * 调研问题
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "survey_question_id")
	private SurveyQuestion surveyQuestion;

	/**
	 * 调研问题选项
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "survey_question_option_id")
	private SurveyQuestionOption surveyQuestionOption;

	/**
	 * 备注 问答题使用
	 */
	private String remark;

	/**
	 * 顺序 排序题使用
	 */
	private String turn;

	/**
	 * 分数 打分题/选择题使用
	 */
	private String score;

	public SurveyUserQuestionnaire getSurveyUserQuestionnaire() {
		return surveyUserQuestionnaire;
	}

	public void setSurveyUserQuestionnaire(SurveyUserQuestionnaire surveyUserQuestionnaire) {
		this.surveyUserQuestionnaire = surveyUserQuestionnaire;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getTurn() {
		return turn;
	}

	public void setTurn(String turn) {
		this.turn = turn;
	}

}
