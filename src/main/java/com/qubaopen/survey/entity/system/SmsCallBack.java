package com.qubaopen.survey.entity.system;

import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.Date;

/**
 * sms189 中国短信网回调 Created by duel on 2014/6/30.
 */
public class SmsCallBack extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -4276646803175758354L;

	/**
	 * 短信 dxid
	 */
	private String backId;

	/**
	 * 短信 yzm验证码
	 */
	private String backCode;

	/**
	 * 时间
	 */
	private Date time;

	public String getBackId() {
		return backId;
	}

	public void setBackId(String backId) {
		this.backId = backId;
	}

	public String getBackCode() {
		return backCode;
	}

	public void setBackCode(String backCode) {
		this.backCode = backCode;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}