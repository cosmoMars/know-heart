package com.qubaopen.survey.entity.user;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.qubaopen.survey.entity.util.AbstractBaseEntity;

/**
 * @author mars 用户金币表
 */
@Entity
@Table(name = "user_gold")
public class UserGold extends AbstractBaseEntity<Long> {

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
