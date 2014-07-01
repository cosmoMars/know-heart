package com.qubaopen.survey.entity.interest;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.user.User;

/**
 * @author mars 兴趣问卷用户答卷
 */
@Entity
@Table(name = "interest_user")
public class InterestUser extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -5171099225306703597L;

	/**
	 * 用户id
	 */
	@ManyToOne
	private User user;

	/**
	 * 用户答卷状态
	 */
	@OneToOne
	private InterestAnswerStatus interestAnswerStatus;

	/**
	 * 问卷id
	 */
	@ManyToOne
	private Interest interest;

	/**
	 * 问卷结果选项
	 */
	@OneToOne
	private InterestResultOption interestResultOption;

	/**
	 * 时间
	 */
	private Date time;

	/**
	 * 新浪分享
	 */
	private Boolean isSharedSina;

	/**
	 * 腾讯分享
	 */
	private Boolean isSharedTencent;

	/**
	 * 微信朋友圈分享
	 */
	private Boolean isSharedWeChatFriend;

	/**
	 * QQ空间分享
	 */
	private Boolean isSharedQQSpace;

	/**
	 * 微信分享
	 */
	private Boolean isSharedWeChat;

	/**
	 * 用户历史问卷，同步发送标志位 0 未发送 1发送中 2 已发送
	 */
	@Enumerated
	private Transmit isTransmit;

	/**
	 * 是否公开 0 不公开 1 公开
	 */
	@Column(length = 1)
	private Integer isPublic;

	/**
	 * 删除标志位
	 */
	@Column(length = 1)
	private Integer isRemoved;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public InterestAnswerStatus getInterestAnswerStatus() {
		return interestAnswerStatus;
	}

	public void setInterestAnswerStatus(InterestAnswerStatus interestAnswerStatus) {
		this.interestAnswerStatus = interestAnswerStatus;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Integer isPublic) {
		this.isPublic = isPublic;
	}

	public Integer getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Integer isRemoved) {
		this.isRemoved = isRemoved;
	}

	public Boolean getIsSharedSina() {
		return isSharedSina;
	}

	public void setIsSharedSina(Boolean isSharedSina) {
		this.isSharedSina = isSharedSina;
	}

	public Boolean getIsSharedTencent() {
		return isSharedTencent;
	}

	public void setIsSharedTencent(Boolean isSharedTencent) {
		this.isSharedTencent = isSharedTencent;
	}

	public Boolean getIsSharedWeChatFriend() {
		return isSharedWeChatFriend;
	}

	public void setIsSharedWeChatFriend(Boolean isSharedWeChatFriend) {
		this.isSharedWeChatFriend = isSharedWeChatFriend;
	}

	public Boolean getIsSharedQQSpace() {
		return isSharedQQSpace;
	}

	public void setIsSharedQQSpace(Boolean isSharedQQSpace) {
		this.isSharedQQSpace = isSharedQQSpace;
	}

	public Boolean getIsSharedWeChat() {
		return isSharedWeChat;
	}

	public void setIsSharedWeChat(Boolean isSharedWeChat) {
		this.isSharedWeChat = isSharedWeChat;
	}

	public Transmit getIsTransmit() {
		return isTransmit;
	}

	public void setIsTransmit(Transmit isTransmit) {
		this.isTransmit = isTransmit;
	}

	/**
	 * 用户历史问卷，同步发送标志位 NoTransmit 0 未发送,Transmiting 1 发送中,Transmitted 2 已发送
	 */
	public enum Transmit {
		NoTransmit, Transmiting, Transmitted
	}

	public InterestResultOption getInterestResultOption() {
		return interestResultOption;
	}

	public void setInterestResultOption(InterestResultOption interestResultOption) {
		this.interestResultOption = interestResultOption;
	}

}
