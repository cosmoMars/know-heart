package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户反馈表
 */
@Entity
@Table(name = "user_feed_back")
@Audited
public class UserFeedBack extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -4149843099074806989L;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 反馈时间
	 */
	private Date feedBackTime;

	/**
	 * 用户id
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	/**
	 * 意见反馈的用户类型 0 是默认普通用户 1是企业用户
	 */
	@Enumerated
	private FeedBackType feedBackType;

	/**
	 * ORDINARY 0 普通用户, ENTERPRISE 1 企业用户
	 */
	private enum FeedBackType {
		ORDINARY, ENTERPRISE
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getFeedBackTime() {
		return feedBackTime;
	}

	public void setFeedBackTime(Date feedBackTime) {
		this.feedBackTime = feedBackTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public FeedBackType getFeedBackType() {
		return feedBackType;
	}

	public void setFeedBackType(FeedBackType feedBackType) {
		this.feedBackType = feedBackType;
	}

}
