package com.qubaopen.survey.entity.user;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.interest.InterestUser;
import com.qubaopen.survey.entity.interest.InterestUserAnswer;

/**
 * @author mars 用户表
 */
@Entity
@Table(name = "user")
public class User extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -6865482202586788603L;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 电话
	 */
	private String phone;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 是否激活
	 */
	@Column(length = 1)
	private Integer isActivated;

	/**
	 * 删除标志位
	 */
	@Column(length = 1)
	private Integer isRemoved;

	/**
	 * 用户信息
	 */
	@OneToOne
	private UserInfo userInfo;

	/**
	 * 用户身份证绑定
	 */
	@OneToOne
	private UserIDCardBind userIDCardBind;

	/**
	 * 好友集合
	 */
	@ManyToMany(mappedBy = "users")
	private Set<UserFriend> userFriends;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIsActivated() {
		return isActivated;
	}

	public void setIsActivated(Integer isActivated) {
		this.isActivated = isActivated;
	}

	public Integer getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Integer isRemoved) {
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

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public UserIDCardBind getUserIDCardBind() {
		return userIDCardBind;
	}

	public void setUserIDCardBind(UserIDCardBind userIDCardBind) {
		this.userIDCardBind = userIDCardBind;
	}

	public Set<UserFriend> getUserFriends() {
		return userFriends;
	}

	public void setUserFriends(Set<UserFriend> userFriends) {
		this.userFriends = userFriends;
	}

}
