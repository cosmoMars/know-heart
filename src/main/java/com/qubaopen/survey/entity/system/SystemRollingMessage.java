package com.qubaopen.survey.entity.system;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 滚动信息 Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "SYSTEM_ROLLING_MESSAGE")
public class SystemRollingMessage extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 5086721444941390671L;

	/**
	 * 内容
	 */
	private String content;

	private boolean isRemoved;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

}
