package com.qubaopen.survey.entity.survey;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 调研问卷 用户问卷 答题内容
 * Created by duel on 2014/6/26.
 */

@Entity
@Table(name = "SURVEY_USER_QUESTION")
public class SurveyUserQuestion  extends AbstractPersistable<Long> {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SurveyUserQuestionnaire surveyUserQuestionnaire;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SurveyQuestion surveyQuestion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SurveyQuestionOption surveyQuestionOption;

    /**
     * 备注  问答题使用
     */
    private String remark;

    /**
     * 顺序  排序题使用
     */
    private String order;

    /**
     * 分数  打分题/选择题使用
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

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
