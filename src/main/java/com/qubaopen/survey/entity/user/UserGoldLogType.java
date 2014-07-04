package com.qubaopen.survey.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 用户金币日志信息 Created by duel on 2014/6/30.
 */
@Entity
@Table(name = "user_gold_log_type")
public class UserGoldLogType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 2932699076385689268L;

	/**
	 * 名称
	 */
	private String name;

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
