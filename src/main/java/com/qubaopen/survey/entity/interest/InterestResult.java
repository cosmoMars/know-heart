package com.qubaopen.survey.entity.interest;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	 * 问卷类型
	 */
	@ManyToOne
	private InterestResultType interestResultType;

	/**
	 * 问题结果选项
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interestResult", cascade = { PERSIST, REMOVE })
	private Set<InterestResultSelection> interestResultSelections;

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

}
