package com.qubaopen.survey.entity.base;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class AreaCode implements Serializable {

	private static final long serialVersionUID = 257444020493599858L;

	private String name;

	@Column(unique = true)
	private String code;

	private boolean isShow;

	@ManyToOne(fetch = FetchType.LAZY)
	private AreaCode parent;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent", cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
	private Set<AreaCode> children;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	public AreaCode getParent() {
		return parent;
	}

	public void setParent(AreaCode parent) {
		this.parent = parent;
	}

	public Set<AreaCode> getChildren() {
		return children;
	}

	public void setChildren(Set<AreaCode> children) {
		this.children = children;
	}

}
