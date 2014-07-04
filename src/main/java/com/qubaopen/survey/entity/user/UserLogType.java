package com.qubaopen.survey.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户日志类型表
 */
@Entity
@Table(name = "user_log_type")
public class UserLogType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -6195056432423838620L;

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
