package com.qubaopen.survey.entity.customer;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 客户金币
 * Created by duel on 2014/6/27.
 */

@Entity
@Table(name = "CUSTOMER_GOLD")
public class CustomerGold extends AbstractPersistable<Long> {

    private Customer customer;

    /**
     * 总金币
     */
    private Integer totalGold;

    /**
     * 当前金币
     */
    private Integer currentGold;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(Integer totalGold) {
        this.totalGold = totalGold;
    }

    public Integer getCurrentGold() {
        return currentGold;
    }

    public void setCurrentGold(Integer currentGold) {
        this.currentGold = currentGold;
    }
}
