package com.qubaopen.survey.entity.survey;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 调研问卷 问卷类型 码表 Created by duel on 2014/6/25.
 */

@Entity
@Table(name = "SURVEY_TYPE")
public class SurveyType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 4474601818820681680L;

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
