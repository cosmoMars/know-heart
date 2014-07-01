package com.qubaopen.survey.entity.log;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.user.User;

/**
 * @author mars 日志 身份认证
 */
@Entity
@Table(name = "log_check_id_card")
public class LogCheckIDCard extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 8595157813582664841L;

	/**
	 * 用户id
	 */
	@ManyToOne
	private User user;

	/**
	 * 名字
	 */
	private String name;

	/**
	 * 身份证
	 */
	private String IDCard;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 认证结果 0身份证不正确 1姓名不匹配 2匹配
	 */
	@Enumerated
	private Result checkResult;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Result getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(Result checkResult) {
		this.checkResult = checkResult;
	}

	/**
	 * 认证结果 IncorrectID 0 身份证不正确, MismatchName 1姓名不匹配,Match 2 匹配
	 */
	public enum Result {
		IncorrectID, MismatchName, Match
	}
}
