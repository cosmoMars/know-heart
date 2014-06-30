package com.qubaopen.survey.entity.survey;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 调研问卷 问题 选项
 * Created by duel on 2014/6/25.
 */
@Entity
@Table(name = "SURVEY_QUESTION_OPTION")
public class SurveyQuestionOption extends AbstractPersistable<Long> {


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SurveyQuestion surveyQuestion;

    /**
     * 选项内容
     */
    private String content;

    /**
     * 选项编号  A B C /1 2 3
     */
    private String serialNumber;

    public SurveyQuestion getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(SurveyQuestion surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
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
}
