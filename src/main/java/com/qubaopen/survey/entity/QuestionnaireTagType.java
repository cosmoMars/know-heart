package com.qubaopen.survey.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 问卷标签 码表 问卷列表中显示的标签 （例如：“热门” “最新” “推荐”等） Created by duel on 2014/6/25.
 */

@Entity
@Table(name = "QUESTIONNAIRE_TAG_TYPE")
public class QuestionnaireTagType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -2335552412742913115L;

	private String description;

	@Column(columnDefinition = "tinyint(1) DEFAULT 0")
	private Integer isRemoved;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Integer isRemoved) {
		this.isRemoved = isRemoved;
	}

}
