package com.qubaopen.survey.entity.reward;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 奖品类型 Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "REWARD_TYPE")
public class RewardType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -145447906458238247L;

	/**
	 * 名称
	 */
	private String name;

	private Boolean isRemoved;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

}
