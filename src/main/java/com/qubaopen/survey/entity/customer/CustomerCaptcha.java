package com.qubaopen.survey.entity.customer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 客户验证码 Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "customer_captcha")
public class CustomerCaptcha extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 1513240828180985079L;

	/**
	 * 客户
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false, unique = true)
	private Customer customer;

	/**
	 * 验证码
	 */
	@Column(nullable = false, length = 6)
	private String captcha;

	/**
	 * 最后验证日期
	 */
	private Date lastCheckedDate;

	/**
	 * 验证次数
	 */
	private Integer checkCount;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getCheckCount() {
		return checkCount;
	}

	public void setCheckCount(Integer checkCount) {
		this.checkCount = checkCount;
	}

	public Date getLastCheckedDate() {
		return lastCheckedDate;
	}

	public void setLastCheckedDate(Date lastCheckedDate) {
		this.lastCheckedDate = lastCheckedDate;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
}
