package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 用户金币提现 Created by duel on 2014/6/30.
 */
@Entity
@Table(name = "user_gold_withdraw")
public class UserGoldWithdraw extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -2549424406992062378L;

	/**
	 * 提现用户
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private User user;

	/**
	 * 用户提现银行
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private UserWithdrawBankType userWithdrawBankType;

	/**
	 * 提现数量
	 */
	private Integer amount;

	/**
	 * 提现账号
	 */
	private String account;

	/**
	 * 提现审核状态 0审核中 1成功 2失败
	 */
	@Enumerated
	private Status status;

	/**
	 * VERIFYING 0 审核中, SUCCEED 1 成功, FAILURE 2 失败
	 */
	public enum Status {
		VERIFYING, SUCCEED, FAILURE
	}

	/**
	 * 提现方式 0银行卡 1支付宝
	 */
	@Enumerated
	private Way way;

	/**
	 * BANKCARD 0 银行卡, ALIPAY 1 支付宝
	 */
	public enum Way {
		BANKCARD, ALIPAY
	}

	/**
	 * 交易号 提现成功时使用
	 */
	private String transactionNumber;

	/**
	 * 失败原因 提现失败时使用
	 */
	private String failureReason;

	/**
	 * 实际到账金额 般指扣除手续费以后的金额
	 */
	@Column(columnDefinition = "DECIMAL(7,2)")
	private Double receivedValue;

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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public Double getReceivedValue() {
		return receivedValue;
	}

	public void setReceivedValue(Double receivedValue) {
		this.receivedValue = receivedValue;
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

	public Date getModifyTime() {
		return modifyTime;
	}

	public UserWithdrawBankType getUserWithdrawBankType() {
		return userWithdrawBankType;
	}

	public void setUserWithdrawBankType(UserWithdrawBankType userWithdrawBankType) {
		this.userWithdrawBankType = userWithdrawBankType;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setWay(Way way) {
		this.way = way;
	}

	public Status getStatus() {
		return status;
	}

	public Way getWay() {
		return way;
	}

	public void setModifyUser(Long modifyUser) {
		this.modifyUser = modifyUser;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
