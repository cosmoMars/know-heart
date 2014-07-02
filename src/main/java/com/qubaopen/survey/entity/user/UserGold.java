package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户金币表
 */
@Entity
@Table(name = "user_gold")
public class UserGold extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 8473181373514156943L;

	/**
	 * 用户
	 */
	@OneToOne
	private User user;

	/**
	 * 总金币
	 */
	private Integer totalGold;

	/**
	 * 当前金币
	 */
	private Integer currentGold;

	/**
	 * 经验
	 */
	private Integer experience;

	private Boolean isRemoved;

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

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getTotalGold() {
		return totalGold;
	}

	public void setTotalGold(Integer totalGold) {
		this.totalGold = totalGold;
	}

	public Integer getCurrentGold() {
		return currentGold;
	}

	public void setCurrentGold(Integer currentGold) {
		this.currentGold = currentGold;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

}
