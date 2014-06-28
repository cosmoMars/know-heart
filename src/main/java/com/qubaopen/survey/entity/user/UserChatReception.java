package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户聊天接收表
 */
@Entity
@Table(name = "user_chat_reception")
public class UserChatReception extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 912167512208766053L;

	/**
	 * 发送方
	 */
	@OneToOne
	@JoinColumn(name = "sender_id")
	private User sender;

	/**
	 * 接受方
	 */
	@OneToOne
	@JoinColumn(name = "recipient_id")
	private User recipient;

	/**
	 * 接收时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date receptionTime;

	/**
	 * 服务器获取内容的时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date getContentTime;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 创建人
	 */
	private Long createUser;

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	/**
	 * 修改人
	 */
	private Long modifyUser;

	/**
	 * 修改时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifyTime;

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	public Date getReceptionTime() {
		return receptionTime;
	}

	public void setReceptionTime(Date receptionTime) {
		this.receptionTime = receptionTime;
	}

	public Date getGetContentTime() {
		return getContentTime;
	}

	public void setGetContentTime(Date getContentTime) {
		this.getContentTime = getContentTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		return modifyUser;
	}

	public void setModifyUser(Long modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
