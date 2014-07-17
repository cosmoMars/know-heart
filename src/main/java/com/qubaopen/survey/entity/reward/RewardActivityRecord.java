package com.qubaopen.survey.entity.reward;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.qubaopen.survey.entity.user.User;
import com.qubaopen.survey.entity.user.UserReceiveAddress;
import com.qubaopen.survey.entity.util.AbstractBaseEntity;

/**
 * 用户参与活动记录
 *
 * @author mars
 *
 */
@Entity
@Table(name = "reward_activity_record")
@Audited
public class RewardActivityRecord extends AbstractBaseEntity<Long> {

	private static final long serialVersionUID = -6390778868996308266L;

	/**
	 * 用户
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	/**
	 * 奖品活动
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private RewardActivity rewardActivity;

	/**
	 * 收货地址
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private UserReceiveAddress userReceiveAddress;

	/**
	 *	DELIVERING 发货中, CONFIRMING 待确认, CONFIRMED 已确认, PROCESSING 处理中
	 */
	@Enumerated
	private Status status;


	private enum Status {
		DELIVERING, CONFIRMING, CONFIRMED, PROCESSING
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public RewardActivity getRewardActivity() {
		return rewardActivity;
	}

	public void setRewardActivity(RewardActivity rewardActivity) {
		this.rewardActivity = rewardActivity;
	}

	public UserReceiveAddress getUserReceiveAddress() {
		return userReceiveAddress;
	}

	public void setUserReceiveAddress(UserReceiveAddress userReceiveAddress) {
		this.userReceiveAddress = userReceiveAddress;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
