package com.qubaopen.survey.entity.manager;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * 后台用户
 * Created by duel on 2014/6/23.
 */


@Entity
@Table(name = "MANAGER")
public class Manager extends AbstractPersistable<Long> {

    private String userName;

    private String password;

    private String realName;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "manager_role_id")
    private ManagerRole managerRole;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    private Long createUser;

    private Date createTime;

    private Long ModifyUser;

    private Date ModifyTime;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public ManagerRole getManagerRole() {
        return managerRole;
    }

    public void setManagerRole(ManagerRole managerRole) {
        this.managerRole = managerRole;
    }

    public Integer getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Integer isRemoved) {
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
        return ModifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        ModifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return ModifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        ModifyTime = modifyTime;
    }
}
