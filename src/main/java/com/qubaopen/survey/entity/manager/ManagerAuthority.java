package com.qubaopen.survey.entity.manager;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Created by duel on 2014/6/24. 后台用户权限
 */

@Entity
@Table(name = "MANAGER_AUTHORITY")
public class ManagerAuthority extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -4261601284016380235L;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 用户
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinTable(name = "manager_authority_relateion", joinColumns = @JoinColumn(name = "authority_id"), inverseJoinColumns = @JoinColumn(name = "manager_id"))
	private Set<Manager> managers;

	private Boolean isRemoved;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public Set<Manager> getManagers() {
		return managers;
	}

	public void setManagers(Set<Manager> managers) {
		this.managers = managers;
	}

}
