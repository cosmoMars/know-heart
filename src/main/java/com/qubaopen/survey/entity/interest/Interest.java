package com.qubaopen.survey.entity.interest;

import java.util.Date;
import java.util.Set;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

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
	@ManyToOne
	private InterestType interestType;

	/**
	 * 问题集合
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interest", cascade = { PERSIST, REMOVE })
	private Set<InterestQuestion> interestQuestions;

	/**
	 * 问卷答案
	 */
	@OneToOne
	private InterestResult interestResult;

	/**
	 * 特殊题目插入关系
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interest", cascade = { PERSIST, REMOVE })
	private Set<InterestSpecialInsert> interestSpecialInserts;

	/**
	 * 兴趣标签
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interest", cascade = { PERSIST, REMOVE })
	private Set<InterestTag> interestTag;

	/**
	 * 兴趣问卷用户答卷
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interest", cascade = { PERSIST, REMOVE })
	private Set<InterestUser> interestUsers;

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
	@Column(length = 1)
	private String status;

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
	@ManyToOne
	private InterestContentType interestContentType;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Set<InterestQuestion> getInterestQuestions() {
		return interestQuestions;
	}

	public void setInterestQuestions(Set<InterestQuestion> interestQuestions) {
		this.interestQuestions = interestQuestions;
	}

	public InterestResult getInterestResult() {
		return interestResult;
	}

	public void setInterestResult(InterestResult interestResult) {
		this.interestResult = interestResult;
	}

	public InterestType getInterestType() {
		return interestType;
	}

	public void setInterestType(InterestType interestType) {
		this.interestType = interestType;
	}

	public Set<InterestSpecialInsert> getInterestSpecialInserts() {
		return interestSpecialInserts;
	}

	public void setInterestSpecialInserts(Set<InterestSpecialInsert> interestSpecialInserts) {
		this.interestSpecialInserts = interestSpecialInserts;
	}

	public Set<InterestTag> getInterestTag() {
		return interestTag;
	}

	public void setInterestTag(Set<InterestTag> interestTag) {
		this.interestTag = interestTag;
	}

	public Set<InterestUser> getInterestUsers() {
		return interestUsers;
	}

	public void setInterestUsers(Set<InterestUser> interestUsers) {
		this.interestUsers = interestUsers;
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

}
