package com.qubaopen.survey.entity.survey;

import com.qubaopen.survey.entity.manager.Manager;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * 调研问卷
 * Created by duel on 2014/6/25.
 */

@Entity
@Table(name = "SURVEY")
public class Survey extends AbstractPersistable<Long> {

    /**
     * 调研问卷标题
     */
    private String title;

    /**
     * 调研成功获得的金币
     */
    private Integer coin;

    /**
     * 问卷状态 0  初始状态  1 审核中  2 审核通过 3 审核未通过 4上线状态 5关闭状态
     */
    @Column(columnDefinition = "tinyint(2) DEFAULT 0")
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 调研参与人数
     */
    private Integer answerCount;

    /**
     * 优先级  数值越高越优先
     */
    private Integer priority;

    /**
     * 推荐值  数值越高越推荐
     */
    private Integer recommendation;

    /**
     * 需求数量
     */
    private Integer requireCount;

    /**
     * 完成数量
     */
    private Integer completeCount;

    /**
     * 问卷额外预留比例
     */
    private Float extraProportion;

    private Long customerId;

    private Date reviewTime;

    private String pictureUrl;

    private Integer publishType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SurveyType surveyType;

    private Date startTime;

    private Date endTime;

    private Integer limitCount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Manager reviewUser;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    private Long createUser;

    private Date createTime;

    private Long ModifyUser;

    private Date ModifyTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Integer recommendation) {
        this.recommendation = recommendation;
    }

    public Integer getRequireCount() {
        return requireCount;
    }

    public void setRequireCount(Integer requireCount) {
        this.requireCount = requireCount;
    }

    public Integer getCompleteCount() {
        return completeCount;
    }

    public void setCompleteCount(Integer completeCount) {
        this.completeCount = completeCount;
    }

    public Float getExtraProportion() {
        return extraProportion;
    }

    public void setExtraProportion(Float extraProportion) {
        this.extraProportion = extraProportion;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Integer getPublishType() {
        return publishType;
    }

    public void setPublishType(Integer publishType) {
        this.publishType = publishType;
    }

    public SurveyType getSurveyType() {
        return surveyType;
    }

    public void setSurveyType(SurveyType surveyType) {
        this.surveyType = surveyType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Manager getReviewUser() {
        return reviewUser;
    }

    public void setReviewUser(Manager reviewUser) {
        this.reviewUser = reviewUser;
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
