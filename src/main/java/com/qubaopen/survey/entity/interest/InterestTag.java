package com.qubaopen.survey.entity.interest;

import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.QuestionnaireTagType;

/**
 * @author mars 问卷标签表
 */
//@Entity
//@Table(name = "interest_tag")
public class InterestTag extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 7681067867127150577L;

	@ManyToOne
	private Interest interest;

	/**
	 * 问卷标签
	 */
	@ManyToOne
	private QuestionnaireTagType questionnaireTagType;

	private Boolean isRemoved;

	/**
	 * 创建人
	 */
	private Long createUser;

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	/**
	 * 修改人
	 */
	private Long modifyUser;

	/**
	 * 修改时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifyTime;

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(Long modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public QuestionnaireTagType getQuestionnaireTagType() {
		return questionnaireTagType;
	}

	public void setQuestionnaireTagType(QuestionnaireTagType questionnaireTagType) {
		this.questionnaireTagType = questionnaireTagType;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

}
