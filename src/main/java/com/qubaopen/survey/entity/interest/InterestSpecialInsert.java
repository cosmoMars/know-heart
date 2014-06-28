package com.qubaopen.survey.entity.interest;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars
 *兴趣问卷特殊题插入顺序表
 */
@Entity
@Table(name = "interest_special_insert")
public class InterestSpecialInsert extends AbstractPersistable<Long>{

	private static final long serialVersionUID = -1228043455204471370L;

	/**
	 * 兴趣问卷
	 */
	@ManyToOne
	private Interest interest;
	
	/**
	 * 上一题
	 */
	@ManyToOne
	private InterestQuestion interestQuestion;
	
	/**
	 * 该选项被选择后跳转特殊题
	 */
	@ManyToOne
	private InterestQuestionSelection interestQuestionSelection;
	
	/**
	 * 特殊题
	 */
	@ManyToOne
	private InterestQuestion specialQuestion;

	public InterestQuestion getInterestQuestion() {
		return interestQuestion;
	}

	public void setInterestQuestion(InterestQuestion interestQuestion) {
		this.interestQuestion = interestQuestion;
	}

	public InterestQuestionSelection getInterestQuestionSelection() {
		return interestQuestionSelection;
	}

	public void setInterestQuestionSelection(InterestQuestionSelection interestQuestionSelection) {
		this.interestQuestionSelection = interestQuestionSelection;
	}

	public InterestQuestion getSpecialQuestion() {
		return specialQuestion;
	}

	public void setSpecialQuestion(InterestQuestion specialQuestion) {
		this.specialQuestion = specialQuestion;
	}
	
}
