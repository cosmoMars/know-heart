package com.qubaopen.survey.entity.user;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.qubaopen.survey.entity.util.AbstractBaseEntity;

/**
 * @author mars 用户身份证绑定关系表，将用户ID和其认证过的身份证ID进行绑定
 * 
 */
@Entity
@Table(name = "user_idcard_bind")
public class UserIDCardBind extends AbstractBaseEntity<Long> {

	private static final long serialVersionUID = -8702109493101811229L;

	/**
	 * 用户身份证id
	 */
	@OneToOne
	private UserIDCard userIDCard;

	/**
	 * 用户
	 */
	@OneToOne
	private User user;

	public UserIDCard getUserIDCard() {
		return userIDCard;
	}

	public void setUserIDCard(UserIDCard userIDCard) {
		this.userIDCard = userIDCard;
	}

}
