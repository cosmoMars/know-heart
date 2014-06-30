package com.qubaopen.survey.entity.customer;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 客户验证码
 * Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "CUSTOMER_CHECK_CODE")
public class CustomerCheckCode extends AbstractPersistable<Long> {

    private Customer customer;

    /**
     * 最后验证日期
     */
    private Date checkData;

    /**
     * 验证次数
     */
    private Integer checkCount;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getCheckData() {
        return checkData;
    }

    public void setCheckData(Date checkData) {
        this.checkData = checkData;
    }

    public Integer getCheckCount() {
        return checkCount;
    }

    public void setCheckCount(Integer checkCount) {
        this.checkCount = checkCount;
    }
}
