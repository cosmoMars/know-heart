package com.qubaopen.survey.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 广告用户确认表
 * Created by duel on 2014/6/30.
 */
@Entity
@Table(name = "advertise_confirm")
public class AdvertiseConfirm extends AbstractPersistable<Long> {

    /**
     * 来源
     */
    private String source;

    /**
     * idfa
     */
    private String idfa;

    /**
     * 是否确认
     */
    private Boolean isConfirmed;

    /**
     * 帷千回调地址
     */
    private String callback;

    /**
     * ‘点入’验证32位字符
     */
    private String validate;

    private Date createTime;

    private Date modifyTime;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    public Boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
