package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.base.RegionCode;

/**
 * @author mars 用户配额表
 */
@Entity
@Table(name = "user_quota")
public class UserQuota extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1215357259864269176L;

	/**
	 * 用户id
	 */
	@OneToOne(fetch = FetchType.LAZY)
	private User user;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 出生时间
	 */
	@Temporal(TemporalType.DATE)
	private Date birthday;

	/**
	 * 地区代码
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private RegionCode regionCode;

	private boolean isRemoved;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public RegionCode getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(RegionCode regionCode) {
		this.regionCode = regionCode;
	}

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

}
