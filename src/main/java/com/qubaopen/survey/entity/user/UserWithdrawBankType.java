package com.qubaopen.survey.entity.user;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户提现 银行表
 * Created by duel on 2014/6/30.
 */

@Entity
@Table(name = "user_withdraw_bank_type")
public class UserWithdrawBankType extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -3102994902231943387L;

	/**
     * 名称
     */
    private String name;

    private Boolean isRemoved;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Boolean isRemoved) {
        this.isRemoved = isRemoved;
    }
}