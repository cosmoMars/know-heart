package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars UUID
 */
@Entity
@Table(name = "user_udid")
public class UserUDID extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -8116399075207140241L;

	/**
	 * 用户id
	 */
	@OneToOne
	private User user;

	/**
	 * uuid
	 */
	private String uuid;

	/**
	 * 提醒开始时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;

	/**
	 * 提醒结束时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;

	/**
	 * 是否推送
	 */
	private Boolean isPush;

	/**
	 * 是否确认
	 */
	private Boolean isConfirm;

	/**
	 * 用户来源
	 */
	private String userSource;

	/**
	 * 过时 设置新alias失败，此alias无效
	 */
	private Boolean isOutDate;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	public String getUserSource() {
		return userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getIsPush() {
		return isPush;
	}

	public void setIsPush(Boolean isPush) {
		this.isPush = isPush;
	}

	public Boolean getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Boolean isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Boolean getIsOutDate() {
		return isOutDate;
	}

	public void setIsOutDate(Boolean isOutDate) {
		this.isOutDate = isOutDate;
	}

}
