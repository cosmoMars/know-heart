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
 * Created by duel on 2014/6/23.后台用户角色
 */
@Entity
@Table(name = "MANAGER_ROLE")
public class ManagerRole extends AbstractPersistable<Long> {
	private static final long serialVersionUID = 6347024741943087679L;

	/**
	 * 名称
	 */
	private String name;

	private Boolean isRemoved;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinTable(name = "manager_role_relation", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "manager_id"))
	private Set<Manager> managers;

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
