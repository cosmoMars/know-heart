package com.qubaopen.survey.entity.customer;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 客户金币
 * Created by duel on 2014/6/27.
 */

@Entity
@Table(name = "CUSTOMER_GOLD")
public class CustomerGold extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -53548427329553091L;

	/**
	 * 客户
	 */
	@OneToOne
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
