package com.qubaopen.survey.entity.survey;

import com.qubaopen.survey.entity.QuestionnaireTagType;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * 调研问卷 问卷标签
 * Created by duel on 2014/6/25.
 */

@Entity
@Table(name = "SURVEY_TAG")
public class SurveyTag extends AbstractPersistable<Long> {

    /**
     * 所从属的调研问卷
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Survey survey;

    /**
     * 问卷标签
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private QuestionnaireTagType questionnaireTagType;


    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    private Long createUser;

    private Date createTime;

    private Long ModifyUser;

    private Date ModifyTime;

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public QuestionnaireTagType getQuestionnaireTagType() {
        return questionnaireTagType;
    }

    public void setQuestionnaireTagType(QuestionnaireTagType questionnaireTagType) {
        this.questionnaireTagType = questionnaireTagType;
    }

    public Integer getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Integer isRemoved) {
        this.isRemoved = isRemoved;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifyUser() {
        return ModifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        ModifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return ModifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        ModifyTime = modifyTime;
    }
}
