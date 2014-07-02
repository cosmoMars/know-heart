package com.qubaopen.survey.entity.interest;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.QuestionnaireTagType;

/**
 * @author mars 兴趣问卷
 */
@Entity
@Table(name = "interst")
public class Interest extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 2686784453446880940L;

	/**
	 * 问卷类型
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private InterestType interestType;

//	/**
//	 * 问卷答案
//	 */
//	@OneToOne
//	private InterestResult interestResult;

	/**
	 * 标题
	 */
	private String titile;

	/**
	 * 金币
	 */
	private Integer golds;

	/**
	 * 状态 问卷状态值: 0 初始状态 1 上线状态 2 关闭状态
	 */
	@Enumerated
	private Status status;

	/**
	 * INITIAL 0 初始状态, ONLINE, 1 上线状态, CLOSED 2 关闭状态
	 */
	public enum Status {
		INITIAL, ONLINE, CLOSED
	}

	/**
	 * 备注
	 */
	private String description;

	/**
	 * 答题总人数
	 */
	private Integer totalRespondentsCount;

	/**
	 * 兴趣问卷内容类型表
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private InterestContentType interestContentType;

	/**
	 * 问卷标签集合
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<QuestionnaireTagType> questionnaireTagTypes;

	/**
	 * 推荐值
	 */
	private Integer recommendedValue;

	/**
	 * 创建人
	 */
	private Long createUser;

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	/**
	 * 修改人
	 */
	private Long modifyUser;

	/**
	 * 修改时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifyTime;

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public Integer getGolds() {
		return golds;
	}

	public void setGolds(Integer golds) {
		this.golds = golds;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(Long modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public InterestType getInterestType() {
		return interestType;
	}

	public void setInterestType(InterestType interestType) {
		this.interestType = interestType;
	}

	public InterestContentType getInterestContentType() {
		return interestContentType;
	}

	public void setInterestContentType(InterestContentType interestContentType) {
		this.interestContentType = interestContentType;
	}

	public Integer getRecommendedValue() {
		return recommendedValue;
	}

	public void setRecommendedValue(Integer recommendedValue) {
		this.recommendedValue = recommendedValue;
	}

	public Integer getTotalRespondentsCount() {
		return totalRespondentsCount;
	}

	public void setTotalRespondentsCount(Integer totalRespondentsCount) {
		this.totalRespondentsCount = totalRespondentsCount;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Set<QuestionnaireTagType> getQuestionnaireTagTypes() {
		return questionnaireTagTypes;
	}

	public void setQuestionnaireTagTypes(Set<QuestionnaireTagType> questionnaireTagTypes) {
		this.questionnaireTagTypes = questionnaireTagTypes;
	}

}
