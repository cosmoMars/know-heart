package com.qubaopen.survey.entity.survey;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 调研问卷 问题组 (矩阵题) Created by duel on 2014/6/25.
 */

@Entity
@Table(name = "SURVEY_QUESTION_GROUP")
public class SurveyQuestionGroup extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 7181675767840508914L;

	/**
	 * 在问卷中的标题(矩阵题的大标题)
	 */
	private String content;

	/**
	 * 在问卷中的编号
	 */
	private String serialNumber;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
}
