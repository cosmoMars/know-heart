package com.qubaopen.survey.entity.customer;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 客户
 * Created by duel on 2014/6/25.
 */

@Entity
@Table(name = "CUSTOMER")
public class Customer extends AbstractPersistable<Long> {

    private String email;

    private String phone;

    private String password;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isActivated;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    private Long createUser;

    private Date createTime;

    private Long ModifyUser;

    private Date ModifyTime;

}
