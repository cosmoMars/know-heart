package com.qubaopen.survey.entity.survey;

import java.util.Date;

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
	private Date createTime;

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
	private Boolean isSharedSina;

	/**
	 * 是否在腾讯微博分享 0否 1是
	 */
	private Boolean isSharedTencent;

	/**
	 * 是否在QQ空间分享 0否 1是
	 */
	private Boolean isSharedQQSpace;

	/**
	 * 是否在微信分享 0否 1是
	 */
	private Boolean isSharedWeChat;

	/**
	 * 是否在微信朋友圈分享 0否 1是
	 */
	private Boolean isSharedWeChatFriend;

	private Boolean isRemoved;

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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public Boolean getIsSharedSina() {
		return isSharedSina;
	}

	public void setIsSharedSina(Boolean isSharedSina) {
		this.isSharedSina = isSharedSina;
	}

	public Boolean getIsSharedTencent() {
		return isSharedTencent;
	}

	public void setIsSharedTencent(Boolean isSharedTencent) {
		this.isSharedTencent = isSharedTencent;
	}

	public Boolean getIsSharedQQSpace() {
		return isSharedQQSpace;
	}

	public void setIsSharedQQSpace(Boolean isSharedQQSpace) {
		this.isSharedQQSpace = isSharedQQSpace;
	}

	public Boolean getIsSharedWeChat() {
		return isSharedWeChat;
	}

	public void setIsSharedWeChat(Boolean isSharedWeChat) {
		this.isSharedWeChat = isSharedWeChat;
	}

	public Boolean getIsSharedWeChatFriend() {
		return isSharedWeChatFriend;
	}

	public void setIsSharedWeChatFriend(Boolean isSharedWeChatFriend) {
		this.isSharedWeChatFriend = isSharedWeChatFriend;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}
}
