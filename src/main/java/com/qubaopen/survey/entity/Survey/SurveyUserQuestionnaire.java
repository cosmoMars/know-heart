package com.qubaopen.survey.entity.survey;

import com.qubaopen.survey.entity.User.User;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * 调研问卷 用户答卷
 * Created by duel on 2014/6/25.
 */
@Entity
@Table(name = "SURVEY_USER_QUESTIONNAIRE")
public class SurveyUserQuestionnaire extends AbstractPersistable<Long> {

    private Survey survey;

    @ManyToOne
    private User user;

    /**
     * 答卷时间
     */
    private Date createTime;

    /**
     * 答卷状态
     */
    private SurveyUserQuestionnaireType surveyUserQuestionnaireType;

    /**
     * 发送标志
     */
    private String sendFlag;

    /**
     * 是否在新浪微博分享  0否  1是
     */
    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isXLWBShared;

    /**
     * 是否在腾讯微博分享  0否 1是
     */
    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isTXWBShared;

    /**
     * 是否在QQ空间分享  0否 1是
     */
    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isQQKJShared;

    /**
     * 是否在微信分享  0否 1是
     */
    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isWXShared;

    /**
     * 是否在微信朋友圈分享  0否 1是
     */
    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isWXPYQShared;


    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;


    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public SurveyUserQuestionnaireType getSurveyUserQuestionnaireType() {
        return surveyUserQuestionnaireType;
    }

    public void setSurveyUserQuestionnaireType(SurveyUserQuestionnaireType surveyUserQuestionnaireType) {
        this.surveyUserQuestionnaireType = surveyUserQuestionnaireType;
    }

    public String getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(String sendFlag) {
        this.sendFlag = sendFlag;
    }

    public Integer getIsXLWBShared() {
        return isXLWBShared;
    }

    public void setIsXLWBShared(Integer isXLWBShared) {
        this.isXLWBShared = isXLWBShared;
    }

    public Integer getIsTXWBShared() {
        return isTXWBShared;
    }

    public void setIsTXWBShared(Integer isTXWBShared) {
        this.isTXWBShared = isTXWBShared;
    }

    public Integer getIsQQKJShared() {
        return isQQKJShared;
    }

    public void setIsQQKJShared(Integer isQQKJShared) {
        this.isQQKJShared = isQQKJShared;
    }

    public Integer getIsWXShared() {
        return isWXShared;
    }

    public void setIsWXShared(Integer isWXShared) {
        this.isWXShared = isWXShared;
    }

    public Integer getIsWXPYQShared() {
        return isWXPYQShared;
    }

    public void setIsWXPYQShared(Integer isWXPYQShared) {
        this.isWXPYQShared = isWXPYQShared;
    }

    public Integer getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Integer isRemoved) {
        this.isRemoved = isRemoved;
    }
}
