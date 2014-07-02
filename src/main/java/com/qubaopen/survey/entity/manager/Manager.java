package com.qubaopen.survey.entity.manager;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 后台用户 Created by duel on 2014/6/23.
 */

@Entity
@Table(name = "MANAGER")
public class Manager extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 25719655323537319L;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 角色
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<ManagerRole> managerRoles;

	/**
	 * 权限
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<ManagerAuthority> managerAuthorities;

	private Boolean isRemoved;

	private Long createUser;

	private Date createTime;

	private Long ModifyUser;

	private Date ModifyTime;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
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
		return ModifyUser;
	}

	public void setModifyUser(Long modifyUser) {
		ModifyUser = modifyUser;
	}

	public Date getModifyTime() {
		return ModifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		ModifyTime = modifyTime;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public Set<ManagerRole> getManagerRoles() {
		return managerRoles;
	}

	public void setManagerRoles(Set<ManagerRole> managerRoles) {
		this.managerRoles = managerRoles;
	}

	public Set<ManagerAuthority> getManagerAuthorities() {
		return managerAuthorities;
	}

	public void setManagerAuthorities(Set<ManagerAuthority> managerAuthorities) {
		this.managerAuthorities = managerAuthorities;
	}
}
