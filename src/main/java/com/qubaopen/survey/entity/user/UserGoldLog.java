package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 用户金币日志 Created by duel on 2014/6/30.
 */
@Entity
@Table(name = "user_gold_log")
public class UserGoldLog extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -4484515900517076463L;

	/**
	 * 用户
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private User user;

	/**
	 * 用户金币日志类型
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private UserGoldLogType userGoldLogType;

	/**
	 * 正负 0加 1扣
	 */
	@Enumerated
	private Type type;

	/**
	 * ADD 0 加, MINUS 1 扣
	 */
	public enum Type {
		ADD, MINUS
	}

	/**
	 * 变动数额
	 */
	private Integer amount;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 详情 根据日志类型 详情可能记录不同的信息
	 */
	private String detail;

	private Boolean isRemoved;

	private Long createUser;

	private Date createTime;

	private Long modifyUser;

	private Date modifyTime;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserGoldLogType getUserGoldLogType() {
		return userGoldLogType;
	}

	public void setUserGoldLogType(UserGoldLogType userGoldLogType) {
		this.userGoldLogType = userGoldLogType;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
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

	public void setType(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}
}
