package com.qubaopen.survey.entity.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户银行卡信息
 */
@Entity
@Table(name = "user_bank_card")
public class UserBankCard extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -469527906871111122L;

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	/**
	 * 用户提现银行
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private UserWithdrawBankType userWithdrawBankType;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 卡号标示
	 */
	private String cardIdentity;

	private boolean isRemoved;

	/**
	 * 是否启用
	 */
	private boolean isEnabled;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardIdentity() {
		return cardIdentity;
	}

	public void setCardIdentity(String cardIdentity) {
		this.cardIdentity = cardIdentity;
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public UserWithdrawBankType getUserWithdrawBankType() {
		return userWithdrawBankType;
	}

	public void setUserWithdrawBankType(UserWithdrawBankType userWithdrawBankType) {
		this.userWithdrawBankType = userWithdrawBankType;
	}

}
