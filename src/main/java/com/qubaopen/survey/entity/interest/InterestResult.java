package com.qubaopen.survey.entity.interest;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 兴趣问卷结果表
 */
@Entity
@Table(name = "interest_result")
public class InterestResult extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 692329675843837712L;

	/**
	 * 兴趣问卷
	 */
	@OneToOne
	private Interest interest;

	/**
	 * 问卷类型
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private InterestResultType interestResultType;

	/**
	 * 标题
	 */
	private String title;

	public InterestResultType getInterestResultType() {
		return interestResultType;
	}

	public void setInterestResultType(InterestResultType interestResultType) {
		this.interestResultType = interestResultType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

}
