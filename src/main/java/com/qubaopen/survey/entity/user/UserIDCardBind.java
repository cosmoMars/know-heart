package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户身份证绑定关系表，将用户ID和其认证过的身份证ID进行绑定
 * 
 */
@Entity
@Table(name = "user_id_card_bind")
public class UserIDCardBind extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -8702109493101811229L;

	/**
	 * 用户身份证id
	 */
	@OneToOne
	private UserIDCard userIDCard;

	/**
	 * 创建人
	 */
	private Long createUser;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改人
	 */
	private Long modifyUser;

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	public UserIDCard getUserIDCard() {
		return userIDCard;
	}

	public void setUserIDCard(UserIDCard userIDCard) {
		this.userIDCard = userIDCard;
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
