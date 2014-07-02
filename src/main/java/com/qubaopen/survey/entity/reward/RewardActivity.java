package com.qubaopen.survey.entity.reward;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 兑奖活动 Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "REWARD_ACTIVITY")
public class RewardActivity extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -591640260100619884L;

	/**
	 * 奖品
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Reward reward;

	/**
	 * 活动标题
	 */
	private String title;

	/**
	 * 活动详细介绍
	 */
	private String content;

	/**
	 * 开始时间
	 */
	private Date startTime;

	/**
	 * 结束时间
	 */
	private Date endTime;

	/**
	 * 消耗金币
	 */
	private Integer requireGold;

	/**
	 * 兑奖活动状态 0 未上线 1 上线 2 结束
	 */
	@Enumerated
	private Status status;

	/**
	 * OFFLINE 0 未上线, ONLINE 1 上线, END 2 结束
	 */
	public enum Status {
		OFFLINE, ONLINE, END
	}

	/**
	 * 活动总共可被参与的次数限制
	 */
	private Integer totalCountLimit;

	/**
	 * 活动目前参与次数
	 */
	private Integer currentCount;

	/**
	 * 每人可以参与的次数限制 0为不限制
	 */
	private Integer eachCountLimit;

	/**
	 * 活动图片
	 */
	private String picUrl;

	/**
	 * 详细活动大图
	 */
	private String pictureUrl;

	private Boolean isRemoved;

	private Long createUser;

	private Date createTime;

	private Long ModifyUser;

	private Date ModifyTime;

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Integer getRequireGold() {
		return requireGold;
	}

	public void setRequireGold(Integer requireGold) {
		this.requireGold = requireGold;
	}

	public Integer getTotalCountLimit() {
		return totalCountLimit;
	}

	public void setTotalCountLimit(Integer totalCountLimit) {
		this.totalCountLimit = totalCountLimit;
	}

	public Integer getCurrentCount() {
		return currentCount;
	}

	public void setCurrentCount(Integer currentCount) {
		this.currentCount = currentCount;
	}

	public Integer getEachCountLimit() {
		return eachCountLimit;
	}

	public void setEachCountLimit(Integer eachCountLimit) {
		this.eachCountLimit = eachCountLimit;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
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

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}
}
