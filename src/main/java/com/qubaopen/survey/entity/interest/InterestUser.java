package com.qubaopen.survey.entity.interest;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private InterestResultSelection interestResultSelection;

	/**
	 * 兴趣问卷用户答题表集合
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interestUser", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<InterestUserAnswer> interestUserAnswers;

	/**
	 * 时间
	 */
	private Date time;

	/**
	 * 新浪分享
	 */
	@Column(length = 1)
	private Integer isSharedSina;

	/**
	 * 腾讯分享
	 */
	@Column(length = 1)
	private Integer isSharedTencent;

	/**
	 * 微信朋友圈分享
	 */
	@Column(length = 1)
	private Integer isSharedWeChatFriend;

	/**
	 * QQ空间分享
	 */
	@Column(length = 1)
	@JoinColumn(name = "is_shared_qq_space")
	private Integer isSharedQQSpace;

	/**
	 * 微信分享
	 */
	@Column(length = 1)
	private Integer isSharedWeChat;

	/**
	 * 用户历史问卷，同步发送标志位 0 未发送 1发送中 2 已发送
	 */
	@Column(length = 1)
	private Integer isTransmit;

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

	public InterestResultSelection getInterestResultSelection() {
		return interestResultSelection;
	}

	public void setInterestResultSelection(InterestResultSelection interestResultSelection) {
		this.interestResultSelection = interestResultSelection;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getIsSharedSina() {
		return isSharedSina;
	}

	public void setIsSharedSina(Integer isSharedSina) {
		this.isSharedSina = isSharedSina;
	}

	public Integer getIsSharedTencent() {
		return isSharedTencent;
	}

	public void setIsSharedTencent(Integer isSharedTencent) {
		this.isSharedTencent = isSharedTencent;
	}

	public Integer getIsSharedWeChatFriend() {
		return isSharedWeChatFriend;
	}

	public void setIsSharedWeChatFriend(Integer isSharedWeChatFriend) {
		this.isSharedWeChatFriend = isSharedWeChatFriend;
	}

	public Integer getIsSharedQQSpace() {
		return isSharedQQSpace;
	}

	public void setIsSharedQQSpace(Integer isSharedQQSpace) {
		this.isSharedQQSpace = isSharedQQSpace;
	}

	public Integer getIsSharedWeChat() {
		return isSharedWeChat;
	}

	public void setIsSharedWeChat(Integer isSharedWeChat) {
		this.isSharedWeChat = isSharedWeChat;
	}

	public Integer getIsTransmit() {
		return isTransmit;
	}

	public void setIsTransmit(Integer isTransmit) {
		this.isTransmit = isTransmit;
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

	public Set<InterestUserAnswer> getInterestUserAnswers() {
		return interestUserAnswers;
	}

	public void setInterestUserAnswers(Set<InterestUserAnswer> interestUserAnswers) {
		this.interestUserAnswers = interestUserAnswers;
	}

}
