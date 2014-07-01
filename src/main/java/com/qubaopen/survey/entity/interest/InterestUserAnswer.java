package com.qubaopen.survey.entity.interest;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.user.User;

/**
 * @author mars 兴趣问卷用户答题表
 */
@Entity
@Table(name = "interest_user_answer")
public class InterestUserAnswer extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -1622068979983415883L;

	/**
	 * 用户id
	 */
	private User user;

	/**
	 * 兴趣问卷用户答卷id
	 */
	@ManyToOne
	private InterestUser interestUser;

	/**
	 * 问题选项
	 */
	@OneToOne
	private InterestQuestionOption interestQuestionOption;

	/**
	 * 问题
	 */
	@OneToOne
	private InterestQuestion interestQuestion;

	/**
	 * 问答题内容
	 */
	private String description;

	/**
	 * 顺序
	 */
	private Integer turn;

	/**
	 * 分数
	 */
	private Integer point;

	public InterestQuestion getInterestQuestion() {
		return interestQuestion;
	}

	public void setInterestQuestion(InterestQuestion interestQuestion) {
		this.interestQuestion = interestQuestion;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public Integer getTurn() {
		return turn;
	}

	public void setTurn(Integer turn) {
		this.turn = turn;
	}

	public InterestUser getInterestUser() {
		return interestUser;
	}

	public void setInterestUser(InterestUser interestUser) {
		this.interestUser = interestUser;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public InterestQuestionOption getInterestQuestionOption() {
		return interestQuestionOption;
	}

	public void setInterestQuestionOption(InterestQuestionOption interestQuestionOption) {
		this.interestQuestionOption = interestQuestionOption;
	}

}
