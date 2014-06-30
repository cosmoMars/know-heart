package com.qubaopen.survey.entity.survey;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 调研问卷 逻辑组 逻辑关系
 * Created by duel on 2014/6/26.
 */
@Entity
@Table(name = "SURVEY_LOGIC_GROUP")
public class SurveyLogicGroup extends AbstractPersistable<Long> {

    /**
     * 所从属的调研问卷
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Survey survey;

    /**
     * 组成员之间的关系 0 或  1 和
     */
    private Integer relation;

    /**
     * 可为空 复杂逻辑使用 组中组
     */
    private SurveyLogicGroup surveyLogicGroup;
    /**
     * 跳转至的题目（结论题号）
     */
    private SurveyQuestion nextQuestion;

    /**
     * 对结论题号进行的操作（例如：跳转至、跳过等）
     */
    private Long todo;


}
