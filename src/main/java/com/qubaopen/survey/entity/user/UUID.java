package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars UUID
 */
@Entity
@Table(name = "uuid")
public class UUID extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -8116399075207140241L;

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
	@Column(length = 1)
	private Integer isPush;

	/**
	 * 是否确认
	 */
	@Column(length = 1)
	private Integer isConfirm;

	/**
	 * 用户来源
	 */
	private String userSource;

	/**
	 * 设置新alias失败，此alias无效（过时）
	 */
	@Column(length = 1)
	private String isAlias;

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

	public String getIsAlias() {
		return isAlias;
	}

	public void setIsAlias(String isAlias) {
		this.isAlias = isAlias;
	}

	public Integer getIsPush() {
		return isPush;
	}

	public void setIsPush(Integer isPush) {
		this.isPush = isPush;
	}

	public Integer getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Integer isConfirm) {
		this.isConfirm = isConfirm;
	}

}
