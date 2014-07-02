package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 验证码
 */
@Entity
@Table(name = "user_check_code")
public class UserCheckCode extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 5256725015863486560L;

	/**
	 * 用户id
	 */
	@OneToOne
	private User user;
	
	/**
	 * 验证码
	 */
	private String checkCode;

	/**
	 * 验证日期
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date checkDate;

	/**
	 * 验证次数
	 */
	private Integer checkNum;

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public Integer getCheckNum() {
		return checkNum;
	}

	public void setCheckNum(Integer checkNum) {
		this.checkNum = checkNum;
	}

}
