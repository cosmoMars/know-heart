package com.qubaopen.survey.entity.survey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 调研问卷  用户问卷 状态
 * Created by duel on 2014/6/26.
 */

@Entity
@Table(name = "SURVEY_USER_QUESTIONNAIRE_TYPE")
public class SurveyUserQuestionnaireType {
    private String description;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Integer isRemoved) {
        this.isRemoved = isRemoved;
    }

}
