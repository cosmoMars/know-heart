package com.qubaopen.survey.entity.survey;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.QuestionnaireTagType;
import com.qubaopen.survey.entity.manager.Manager;

/**
 * 调研问卷 Created by duel on 2014/6/25.
 */

@Entity
@Table(name = "SURVEY")
public class Survey extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -4910589050975466729L;

	/**
	 * 调研问卷标题
	 */
	private String title;

	/**
	 * 调研成功获得的金币
	 */
	private Integer coin;

	/**
	 * 问卷状态 0 初始状态 1 审核中 2 审核通过 3 审核未通过 4上线状态 5关闭状态
	 */
	private Status status;

	/**
	 * 问卷状态 Initial 0 初始状态,Verifying 1 审核中,PassVerify 2 审核通过,NotPassVerify 3
	 * 审核未通过,Online 4上线状态,Closed 5 关闭状态
	 */
	public enum Status {
		Initial, Verifying, PassVerify, NotPassVerify, Online, Closed
	}

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 调研参与人数
	 */
	private Integer answerCount;

	/**
	 * 优先级 数值越高越优先
	 */
	private Integer priority;

	/**
	 * 推荐值 数值越高越推荐
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

	/**
	 * 客户id
	 */
	private Long customerId;

	/**
	 * 审核时间
	 */
	private Date reviewTime;

	/**
	 * 图片url
	 */
	private String pictureUrl;

	/**
	 * 发布方式 0 趣宝盆发布 1 匿名发布
	 */
	private Boolean publishType;

	/**
	 * 发布方式 SystemPublish 0 趣宝盆发布, AnonymousPublish 1 匿名发布
	 */
	public enum Type {
		SystemPublish, AnonymousPublish
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private SurveyType surveyType;

	/**
	 * 开始时间
	 */
	private Date startTime;

	/**
	 * 结束时间
	 */
	private Date endTime;

	/**
	 * 人数限制
	 */
	private Integer limitCount;

	/**
	 * 审核人
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Manager reviewUser;
	
	/**
	 * 问卷标签集合
	 */
	@ManyToOne
	private Set<QuestionnaireTagType> questionnaireTagTypes;

	private Boolean isRemoved;

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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Boolean getPublishType() {
		return publishType;
	}

	public void setPublishType(Boolean publishType) {
		this.publishType = publishType;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}
}
