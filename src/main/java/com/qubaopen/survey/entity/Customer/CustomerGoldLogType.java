package com.qubaopen.survey.entity.customer;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 客户金币日志类型
 * Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "CUSTOMER_GOLD_LOG_TYPE")
public class CustomerGoldLogType extends AbstractPersistable<Long> {

    private String description;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Integer isRemoved) {
        this.isRemoved = isRemoved;
    }

}