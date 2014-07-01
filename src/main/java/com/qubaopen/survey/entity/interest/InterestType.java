package com.qubaopen.survey.entity.interest;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 兴趣问卷类型码表
 */
@Entity
@Table(name = "interest_type")
public class InterestType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 3713754530541959350L;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 删除标志位
	 */
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
