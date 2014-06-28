package com.qubaopen.survey.entity.interest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 兴趣问卷问题顺序
 */
@Entity
@Table(name = "interest_question_order")
public class InterestQuestionOrder extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 2218196538615957102L;

	/**
	 * 题号
	 */
	private String questionNum;

	/**
	 * 该选项的选项号
	 */
	private String optionNum;

	/**
	 * 下题的题号
	 */
	private String nextOptionNum;

	/**
	 * 是否跳过
	 */
	@Column(length = 1)
	private Integer isJump;

	public String getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(String questionNum) {
		this.questionNum = questionNum;
	}

	public String getOptionNum() {
		return optionNum;
	}

	public void setOptionNum(String optionNum) {
		this.optionNum = optionNum;
	}

	public String getNextOptionNum() {
		return nextOptionNum;
	}

	public void setNextOptionNum(String nextOptionNum) {
		this.nextOptionNum = nextOptionNum;
	}

	public Integer getIsJump() {
		return isJump;
	}

	public void setIsJump(Integer isJump) {
		this.isJump = isJump;
	}
}
