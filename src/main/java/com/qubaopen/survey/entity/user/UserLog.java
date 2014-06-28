package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户日志表
 */
@Entity
@Table(name = "user_log")
public class UserLog extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 7154554675839756190L;

	/**
	 * 用户信息
	 */
	@ManyToOne
	private UserInfo userInfo;
	
	/**
	 * 用户类型
	 */
	@ManyToOne
	@JoinColumn(name = "user_log_type_id")
	private UserLogType userLogType;

	/**
	 * 发生时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date Time;

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

	public UserLogType getUserLogType() {
		return userLogType;
	}

	public void setUserLogType(UserLogType userLogType) {
		this.userLogType = userLogType;
	}

	public Date getTime() {
		return Time;
	}

	public void setTime(Date time) {
		Time = time;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Long getModifyUser() {
		return modifyUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
