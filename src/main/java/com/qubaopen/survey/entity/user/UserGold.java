package com.qubaopen.survey.entity.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.qubaopen.survey.entity.util.AbstractBaseEntity2;

/**
 * @author mars 用户金币表
 */
@Entity
@Table(name = "user_gold")
@Audited
public class UserGold extends AbstractBaseEntity2<Long> {

	private static final long serialVersionUID = 8473181373514156943L;

	/**
	 * 用户
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private User user;

	/**
	 * 历史总金币
	 */
	private Integer historyCold;

	/**
	 * 当前金币
	 */
	private Integer currentGold;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getHistoryCold() {
		return historyCold;
	}

	public void setHistoryCold(Integer historyCold) {
		this.historyCold = historyCold;
	}

	public Integer getCurrentGold() {
		return currentGold;
	}

	public void setCurrentGold(Integer currentGold) {
		this.currentGold = currentGold;
	}

}
