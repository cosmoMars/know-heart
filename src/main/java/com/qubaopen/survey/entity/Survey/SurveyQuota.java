package com.qubaopen.survey.entity.survey;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * 调研问卷 配额
 * Created by duel on 2014/6/25.
 */

@Entity
@Table(name = "SURVEY_QUOTA")
public class SurveyQuota extends AbstractPersistable<Long> {

    /**
     * 所从属的调研问卷
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Survey survey;

    private String sex;

    private Integer minimumAge;

    private Integer maximumAge;

    private Integer requireNumber;

    private Integer completeNumber;


    /**
     * 省市区
     */


    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;


    /**
     * 是否激活（控制是否启用）  1启用 0不启用
     */
    @Column(columnDefinition = "tinyint(1) DEFAULT 1")
    private Integer isActivated;


}
