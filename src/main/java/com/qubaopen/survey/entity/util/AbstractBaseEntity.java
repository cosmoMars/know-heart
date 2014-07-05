package com.qubaopen.survey.entity.util;

import static javax.persistence.TemporalType.TIMESTAMP;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

@MappedSuperclass
public abstract class AbstractBaseEntity<ID extends Serializable> extends AbstractPersistable<ID> {

	private static final long serialVersionUID = 2834452590374861385L;

	private boolean isRemoved;

	private Long createdBy;

	@CreatedDate
	@Temporal(TIMESTAMP)
	@Column(updatable = false)
	private Date createdDate;

	private Long lastModifiedBy;

	@LastModifiedDate
	@Temporal(TIMESTAMP)
	private Date lastModifiedDate;

	public DateTime getCreatedDate() {
		return null == createdDate ? null : new DateTime(createdDate);
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = null == createdDate ? null : createdDate.toDate();
	}

	public DateTime getLastModifiedDate() {
		return null == lastModifiedDate ? null : new DateTime(lastModifiedDate);
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = null == lastModifiedDate ? null : lastModifiedDate.toDate();
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

}
