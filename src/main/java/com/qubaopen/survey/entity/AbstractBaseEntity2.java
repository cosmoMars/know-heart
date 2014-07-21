package com.qubaopen.survey.entity;

import static javax.persistence.TemporalType.TIMESTAMP;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public abstract class AbstractBaseEntity2<ID extends Serializable> implements Serializable {

	private static final long serialVersionUID = 4051847990560824873L;

	@Id
	private Long id;

	private Long createdBy;

	@CreatedDate
	@Temporal(TIMESTAMP)
	@Column(updatable = false)
	private Date createdDate;

	private Long lastModifiedBy;

	@LastModifiedDate
	@Temporal(TIMESTAMP)
	private Date lastModifiedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public DateTime getCreatedDate() {
		return null == createdDate ? null : new DateTime(createdDate);
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = null == createdDate ? null : createdDate.toDate();
	}

	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public DateTime getLastModifiedDate() {
		return null == lastModifiedDate ? null : new DateTime(lastModifiedDate);
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = null == lastModifiedDate ? null : lastModifiedDate.toDate();
	}

}
