package com.qubaopen.survey.entity.customer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 客户金币日志 Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "CUSTOMER_GOLD_LOG")
public class CustomerGoldLog extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 7508432504053883435L;

	/**
	 * 客户
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Customer customer;

	/**
	 * 客户金币日志类型
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private CustomerGoldLogType customerGoldLogType;

	/**
	 * 正负 0加 1扣
	 */
	private boolean type;

	/**
	 * 变动数额
	 */
	private Integer amount;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 详情 根据日志类型 详情可能记录不同的信息
	 */
	private String detail;

	/**
	 * 删除标识位
	 */
	private boolean isRemoved;

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerGoldLogType getCustomerGoldLogType() {
		return customerGoldLogType;
	}

	public void setCustomerGoldLogType(CustomerGoldLogType customerGoldLogType) {
		this.customerGoldLogType = customerGoldLogType;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
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

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public boolean isType() {
		return type;
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
