package com.qubaopen.survey.entity.customer;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * 客户金币日志
 * Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "CUSTOMER_GOLD_LOG")
public class CustomerGoldLog  extends AbstractPersistable<Long> {

    /**
     * 客户
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Customer customer;


    /**
     * 客户金币日志类型
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private CustomerGoldLogType customerGoldLogType;

    /**
     * 正负  0加  1扣
     */
    @Column(columnDefinition = "tinyint(1)")
    private Integer type;

    /**
     * 变动数额
     */
    private Integer amount;

    private String remark;

    /**
     * 详情 根据日志类型 详情可能记录不同的信息
     */
    private String detail;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    private Long createUser;

    private Date createTime;

    private Long ModifyUser;

    private Date ModifyTime;



}
