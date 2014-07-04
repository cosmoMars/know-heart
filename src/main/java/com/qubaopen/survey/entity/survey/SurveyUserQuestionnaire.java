package com.qubaopen.survey.entity.survey;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.user.User;

/**
 * 调研问卷 用户答卷 Created by duel on 2014/6/25.
 */
@Entity
@Table(name = "SURVEY_USER_QUESTIONNAIRE")
public class SurveyUserQuestionnaire extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -8944967213471096494L;

	/**
	 * 调研问卷
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private Survey survey;

	/**
	 * 用户
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	/**
	 * 答卷时间
	 */
	private Date createdDate;

	/**
	 * 答卷状态
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private SurveyUserQuestionnaireType surveyUserQuestionnaireType;

	/**
	 * 发送标志
	 */
	@Enumerated
	private Transmit transmit;

	/**
	 * NOTRANSMIT 0 未发送,TRANSMITTING 1 发送中,TRANSMITTED 2 已发送
	 */
	public enum Transmit {
		NOTRANSMIT, TRANSMITTING, TRANSMITTED
	}

	/**
	 * 是否在新浪微博分享 0否 1是
	 */
	private boolean isSharedSina;

	/**
	 * 是否在腾讯微博分享 0否 1是
	 */
	private boolean isSharedTencent;

	/**
	 * 是否在QQ空间分享 0否 1是
	 */
	@Column(name = "is_shared_qq_space")
	private boolean isSharedQQSpace;

	/**
	 * 是否在微信分享 0否 1是
	 */
	private boolean isSharedWeChat;

	/**
	 * 是否在微信朋友圈分享 0否 1是
	 */
	private boolean isSharedWeChatFriend;

	private boolean isRemoved;

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SurveyUserQuestionnaireType getSurveyUserQuestionnaireType() {
		return surveyUserQuestionnaireType;
	}

	public void setSurveyUserQuestionnaireType(SurveyUserQuestionnaireType surveyUserQuestionnaireType) {
		this.surveyUserQuestionnaireType = surveyUserQuestionnaireType;
	}

	public Transmit getTransmit() {
		return transmit;
	}

	public void setTransmit(Transmit transmit) {
		this.transmit = transmit;
	}

	public boolean isSharedSina() {
		return isSharedSina;
	}

	public void setSharedSina(boolean isSharedSina) {
		this.isSharedSina = isSharedSina;
	}

	public boolean isSharedTencent() {
		return isSharedTencent;
	}

	public void setSharedTencent(boolean isSharedTencent) {
		this.isSharedTencent = isSharedTencent;
	}

	public boolean isSharedQQSpace() {
		return isSharedQQSpace;
	}

	public void setSharedQQSpace(boolean isSharedQQSpace) {
		this.isSharedQQSpace = isSharedQQSpace;
	}

	public boolean isSharedWeChat() {
		return isSharedWeChat;
	}

	public void setSharedWeChat(boolean isSharedWeChat) {
		this.isSharedWeChat = isSharedWeChat;
	}

	public boolean isSharedWeChatFriend() {
		return isSharedWeChatFriend;
	}

	public void setSharedWeChatFriend(boolean isSharedWeChatFriend) {
		this.isSharedWeChatFriend = isSharedWeChatFriend;
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
