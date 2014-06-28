package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
	@ManyToOne
	private RegionCode regionCode;

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
