package com.qubaopen.survey.entity.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.qubaopen.survey.entity.util.AbstractBaseEntity;

/**
 * @author mars 用户通讯录表
 */
@Entity
@Table(name = "user_contact_list")
public class UserContactList extends AbstractBaseEntity<Long> {

	private static final long serialVersionUID = 7897735840630703515L;

	/**
	 * 用户id
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	/**
	 * 电话
	 */
	private String phone;

	/**
	 * 姓名
	 */
	private String name;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
