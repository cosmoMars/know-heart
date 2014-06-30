package com.qubaopen.survey.entity.customer;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 客户信息表
 * Created by duel on 2014/6/27.
 */

@Entity
@Table(name = "CUSTOMER_INFO")
public class CustomerInfo extends AbstractPersistable<Long> {

    private Customer customer;

}
