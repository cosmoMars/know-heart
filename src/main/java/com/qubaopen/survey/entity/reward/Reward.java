package com.qubaopen.survey.entity.reward;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 奖品表 Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "REWARD")
public class Reward extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -1786460720258232346L;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 奖品类型 例：兑奖券类 充值卡类 现金红包等
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private RewardType rewardType;

	/**
	 * 库存剩余数量
	 */
	private Integer remainAmount;

	private Boolean isRemoved;

	private Long createUser;

	private Date createTime;

	private Long ModifyUser;

	private Date ModifyTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RewardType getRewardType() {
		return rewardType;
	}

	public void setRewardType(RewardType rewardType) {
		this.rewardType = rewardType;
	}

	public Integer getRemainAmount() {
		return remainAmount;
	}

	public void setRemainAmount(Integer remainAmount) {
		this.remainAmount = remainAmount;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
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
