package com.qubaopen.survey.entity.manager;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * Created by duel on 2014/6/24.
 */


//@Entity
//@Table(name = "MANAGER_ROLE_AUTHORITY")
public class ManagerRoleAuthority extends AbstractPersistable<Long> {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "manager_role_id")
    private ManagerRole managerRole;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ManagerAuthority managerAuthority;

    public ManagerRole getManagerRole() {
        return managerRole;
    }

    public void setManagerRole(ManagerRole managerRole) {
        this.managerRole = managerRole;
    }

    public ManagerAuthority getManagerAuthority() {
        return managerAuthority;
    }

    public void setManagerAuthority(ManagerAuthority managerAuthority) {
        this.managerAuthority = managerAuthority;
    }
}