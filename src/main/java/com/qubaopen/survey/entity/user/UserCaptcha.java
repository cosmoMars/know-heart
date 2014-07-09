package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 验证码
 */
@Entity
@Table(name = "user_captcha")
public class UserCaptcha extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 5256725015863486560L;

	/**
	 * 用户
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false, unique = true)
	private User user;

	/**
	 * 验证码
	 */
	@Column(nullable = false, length = 6)
	private String captcha;

	/**
	 * 短信最后发送日期
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastSentDate;

	/**
	 * 短信发送次数
	 */
	private int sentNum;

	private boolean isRemoved;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public Date getLastSentDate() {
		return lastSentDate;
	}

	public void setLastSentDate(Date lastSentDate) {
		this.lastSentDate = lastSentDate;
	}

	public int getSentNum() {
		return sentNum;
	}

	public void setSentNum(int sentNum) {
		this.sentNum = sentNum;
	}


}
