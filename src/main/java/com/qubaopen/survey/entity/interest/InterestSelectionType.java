package com.qubaopen.survey.entity.interest;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 兴趣问卷选项逻辑表
 */
@Entity
@Table(name = "interest_selection_type")
public class InterestSelectionType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -6212418266335746157L;

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
