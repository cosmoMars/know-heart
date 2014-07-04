package com.qubaopen.survey.entity.customer;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 客户金币日志类型 Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "CUSTOMER_GOLD_LOG_TYPE")
public class CustomerGoldLogType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -6217722598880429512L;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 删除标志位
	 */
	private boolean isRemoved;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

}