package com.qubaopen.survey.entity.log;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.user.User;

/**
 * @author mars 日志 验证码
 */
@Entity
@Table(name = "log_check_code")
public class LogCheckCode extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -2262820130076627385L;

	/**
	 * 用户id
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	/**
	 * 输入的验证码
	 */
	private String enteredCheckCode;

	/**
	 * 正确的验证码
	 */
	private String correctCheckCode;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 验证结果
	 */
	private Boolean checkResult;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getEnteredCheckCode() {
		return enteredCheckCode;
	}

	public void setEnteredCheckCode(String enteredCheckCode) {
		this.enteredCheckCode = enteredCheckCode;
	}

	public String getCorrectCheckCode() {
		return correctCheckCode;
	}

	public void setCorrectCheckCode(String correctCheckCode) {
		this.correctCheckCode = correctCheckCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Boolean getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}

}
