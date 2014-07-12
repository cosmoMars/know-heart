package com.qubaopen.survey.entity.interest;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.user.User;

/**
 * @author mars 兴趣问卷用户答题表
 */
@Entity
@Table(name = "interest_user_answer")
@Audited
public class InterestUserAnswer extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -1622068979983415883L;

	/**
	 * 用户id
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	/**
	 * 兴趣问卷用户答卷id
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "interest_user_questionnaire_id")
	private InterestUserQuestionnaire interestUserQuestionnaire;

	/**
	 * 所答的选项ID
	 */
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "interest_question_option_id", unique = true)
	private InterestQuestionOption interestQuestionOption;

	/**
	 * 用户答卷的问题ID
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "interest_question_id", unique = true)
	private InterestQuestion interestQuestion;

	/**
	 * 问答题内容
	 */
	private String content;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public InterestUserQuestionnaire getInterestUserQuestionnaire() {
		return interestUserQuestionnaire;
	}

	public void setInterestUserQuestionnaire(InterestUserQuestionnaire interestUserQuestionnaire) {
		this.interestUserQuestionnaire = interestUserQuestionnaire;
	}

}
