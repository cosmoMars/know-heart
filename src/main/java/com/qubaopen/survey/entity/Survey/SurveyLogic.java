package com.qubaopen.survey.entity.survey;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 调研问卷 问题 顺序 （逻辑）
 * Created by duel on 2014/6/26.
 */

@Entity
@Table(name = "SURVEY_LOGIC")
public class SurveyLogic extends AbstractPersistable<Long> {

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



}
