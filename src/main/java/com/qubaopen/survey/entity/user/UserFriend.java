package com.qubaopen.survey.entity.user;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户好友
 */
@Entity
@Table(name = "user_friends")
public class UserFriend extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -4345699594852842100L;

	/**
	 * 好友对应的用户
	 */
	@ManyToMany//(fetch = FetchType.LAZY, mappedBy = "userFriends", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinTable(name = "user_friend_relation", joinColumns = @JoinColumn(name = "friend_id"), inverseJoinColumns =  @JoinColumn(name = "user_id") )
	private Set<User> users;

	/**
	 * 删除标志位
	 */
	@Column(length = 1)
	private Integer isRemoved;

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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
