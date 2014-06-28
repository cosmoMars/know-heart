package com.qubaopen.survey.entity.interest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 问卷结果类型
 */
@Entity
@Table(name = "interest_result_type")
public class InterestResultType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 5635465585709085490L;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 删除标志位
	 */
	@Column(length = 1)
	private Integer isRemoved;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Integer isRemoved) {
		this.isRemoved = isRemoved;
	}

}
