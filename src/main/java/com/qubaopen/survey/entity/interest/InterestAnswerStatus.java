package com.qubaopen.survey.entity.interest;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 兴趣问卷用户答卷状态码表
 */
@Entity
@Table(name = "interest_answer_status")
public class InterestAnswerStatus extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -7887564106764682817L;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 删除标志位
	 */
	private Boolean isRemoved;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

}
