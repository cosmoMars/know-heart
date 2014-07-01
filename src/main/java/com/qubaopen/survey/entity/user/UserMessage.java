package com.qubaopen.survey.entity.user;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.util.Date;

/**
 * 用户站内信 Created by duel on 2014/6/30.
 */
@Entity
@Table(name = "user_message")
public class UserMessage extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 7714281517994739016L;

	/**
	 * 用户
	 */
	@ManyToOne
	private User user;

	/**
	 * 站内信标题
	 */
	private String title;

	/**
	 * 站内信内容
	 */
	private String content;

	/**
	 * 是否推送
	 */
	private Boolean isPush;

	/**
	 * 是否已读
	 */
	private Boolean isRead;

	/**
	 * 站内信类型
	 */
	private Integer messageType;

	/**
	 * 发送标志 0未发送 1发送中 2已发送
	 */
	public Transmit transmit;

	/**
	 * NoTransmit 0 未发送, Transmiting 1 发送中,Transmitted 2 已发送
	 */
	public enum Transmit {
		NoTransmit, Transmiting, Transmitted
	}

	/**
	 * 发送来源
	 */
	private String sendSource;

	/**
	 * 推送时间
	 */
	private Date pushTime;

	private Date createTime;

	private Long createUser;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public Boolean getIsPush() {
		return isPush;
	}

	public void setIsPush(Boolean isPush) {
		this.isPush = isPush;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public Integer getMessageType() {
		return messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}

	public Date getPushTime() {
		return pushTime;
	}

	public void setPushTime(Date pushTime) {
		this.pushTime = pushTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Transmit getTransmit() {
		return transmit;
	}

	public void setTransmit(Transmit transmit) {
		this.transmit = transmit;
	}

	public String getSendSource() {
		return sendSource;
	}

	public void setSendSource(String sendSource) {
		this.sendSource = sendSource;
	}
}