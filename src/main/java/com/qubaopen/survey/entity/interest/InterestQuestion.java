package com.qubaopen.survey.entity.interest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 兴趣问卷问题表
 */
@Entity
@Table(name = "interest_question")
public class InterestQuestion extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -275996218159783931L;

	/**
	 * 问卷id
	 */
	@ManyToOne
	private Interest interest;

	/**
	 * 问卷类型
	 */
	@ManyToOne
	private InterestQuestionType interestQuestionType;

	/**
	 * 问题顺数
	 */
	@OneToOne
	private InterestQuestionOrder interestQuestionOrder;

	/**
	 * 选项数量
	 */
	private Integer optionCount;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 题号
	 */
	private Integer questionNum;

	/**
	 * 是否性格特殊问题
	 */
	@Column(length = 1)
	private Integer isSpecial;

	/**
	 * 答题时间
	 */
	private Integer answerTime;

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(Integer questionNum) {
		this.questionNum = questionNum;
	}

	public Integer getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(Integer isSpecial) {
		this.isSpecial = isSpecial;
	}

	public Integer getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(Integer answerTime) {
		this.answerTime = answerTime;
	}

	public InterestQuestionOrder getInterestQuestionOrder() {
		return interestQuestionOrder;
	}

	public void setInterestQuestionOrder(InterestQuestionOrder interestQuestionOrder) {
		this.interestQuestionOrder = interestQuestionOrder;
	}

	public InterestQuestionType getInterestQuestionType() {
		return interestQuestionType;
	}

	public void setInterestQuestionType(InterestQuestionType interestQuestionType) {
		this.interestQuestionType = interestQuestionType;
	}

	public Integer getOptionCount() {
		return optionCount;
	}

	public void setOptionCount(Integer optionCount) {
		this.optionCount = optionCount;
	}

}
