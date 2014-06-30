package com.qubaopen.survey.entity.survey;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * 调研问卷 问题
 * Created by duel on 2014/6/25.
*/
@Entity
@Table(name = "SURVEY_QUESTION")
public class SurveyQuestion  extends AbstractPersistable<Long> {
    /**
     * 所从属的调研问卷
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Survey survey;

    private String content;

    private String serialNumber;

    private Integer optionNumber;

    /**
     * 题目类型 选择 问答 排序 打分
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SurveyQuestionType surveyQuestionType;


    /**
     * 是否为性格题
     */
    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isCharactered;

    /**
     * 答题最短时间限制
     */
    @Column(columnDefinition = "int DEFAULT 0")
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

}
