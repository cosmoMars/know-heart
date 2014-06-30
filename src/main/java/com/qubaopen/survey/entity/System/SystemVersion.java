package com.qubaopen.survey.entity.system;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 系统  软件版本
 * Created by duel on 2014/6/27.
 */

@Entity
@Table(name = "SYSTEM_VERSION")
public class SystemVersion extends AbstractPersistable<Long> {

    /**
     * 版本号
     */
    private String version;

    /**
     * 0 安卓 1 ios  2 web
     */
    @Column(columnDefinition = "tinyint(1)")
    private Integer type;

    /**
     * 下载地址
     */
    private String downloadUrl;

    /**
     * 更新内容 说明
     */
    private String detail;

    private String md5Hash;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    private Long createUser;

    private Date createTime;

    private Long ModifyUser;

    private Date ModifyTime;

}
