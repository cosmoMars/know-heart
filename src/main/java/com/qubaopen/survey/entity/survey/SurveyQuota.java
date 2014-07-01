package com.qubaopen.survey.entity.survey;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.base.ProvinceCode;

/**
 * 调研问卷 配额 Created by duel on 2014/6/25.
 */

@Entity
@Table(name = "SURVEY_QUOTA")
public class SurveyQuota extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 4427676320593963672L;

	/**
	 * 所从属的调研问卷
	 */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Survey survey;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 最小年龄
	 */
	private Integer minAge;

	/**
	 * 最大年龄
	 */
	private Integer maxAge;

	/**
	 * 该配额的需求数量
	 */
	private Integer requireNumber;

	/**
	 * 该配额的完成数量
	 */
	private Integer completeNumber;

	/**
	 * 省市区
	 */
	@ManyToOne
	private ProvinceCode provinceCode;

	private Boolean isRemoved;

	/**
	 * 是否激活（控制是否启用） 1启用 0不启用
	 */
	private Boolean isActivated;

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	public Integer getRequireNumber() {
		return requireNumber;
	}

	public void setRequireNumber(Integer requireNumber) {
		this.requireNumber = requireNumber;
	}

	public Integer getCompleteNumber() {
		return completeNumber;
	}

	public void setCompleteNumber(Integer completeNumber) {
		this.completeNumber = completeNumber;
	}

	public ProvinceCode getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(ProvinceCode provinceCode) {
		this.provinceCode = provinceCode;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public Boolean getIsActivated() {
		return isActivated;
	}

	public void setIsActivated(Boolean isActivated) {
		this.isActivated = isActivated;
	}

}
