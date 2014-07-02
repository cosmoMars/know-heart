package com.qubaopen.survey.entity.interest;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 兴趣问卷问题选项表
 */
@Entity
@Table(name = "interest_question_selection")
public class InterestQuestionOption extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 4851011172553120290L;

	/**
	 * 问卷id
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private InterestQuestion interestQuestion;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 分数
	 */
	private Integer score;

	/**
	 * 题号
	 */
	private String questionNum;

	public InterestQuestion getInterestQuestion() {
		return interestQuestion;
	}

	public void setInterestQuestion(InterestQuestion interestQuestion) {
		this.interestQuestion = interestQuestion;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(String questionNum) {
		this.questionNum = questionNum;
	}
}
