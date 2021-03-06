package com.qubaopen.survey.entity.reward;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.qubaopen.survey.entity.AbstractBaseEntity;

/**
 * 奖品信息 Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "REWARD_INFO")
@Audited
public class RewardInfo extends AbstractBaseEntity<Long> {

	private static final long serialVersionUID = 3579310378689479962L;

	/**
	 * 奖品
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reward_id")
	private Reward reward;

	/**
	 * 条形码内容
	 */
	private String content;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 兑换密码
	 */
	private String secretCode;

	/**
	 * 二维码
	 */
	@Column(name = "qr_code")
	private String QRCode;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 失效期
	 */
	private Date expirationDate;

	/**
	 * 是否被使用
	 */
	private boolean isUsed;

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}

	public String getQRCode() {
		return QRCode;
	}

	public void setQRCode(String qRCode) {
		QRCode = qRCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

}
