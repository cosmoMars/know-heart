package com.qubaopen.survey.entity.user;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户金币日志
 * Created by duel on 2014/6/30.
 */
@Entity
@Table(name = "user_gold_log")
public class UserGoldLog extends AbstractPersistable<Long> {

    /**
     * 用户
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user;

    /**
     * 用户金币日志类型
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private UserGoldLogType userGoldLogType;

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

    private Boolean isRemoved;

    private Long createUser;

    private Date createTime;

    private Long modifyUser;

    private Date modifyTime;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserGoldLogType getUserGoldLogType() {
        return userGoldLogType;
    }

    public void setUserGoldLogType(UserGoldLogType userGoldLogType) {
        this.userGoldLogType = userGoldLogType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Boolean getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Boolean isRemoved) {
        this.isRemoved = isRemoved;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
