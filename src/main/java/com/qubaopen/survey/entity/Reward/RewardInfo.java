package com.qubaopen.survey.entity.reward;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 奖品信息
 * Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "REWARD_INFO")
public class RewardInfo extends AbstractPersistable<Long> {

    private Reward reward;

    private String detail;

    private String title;

    /**
     * 兑换密码
     */
    private String secretCode;

    /**
     * 二维码
     */
    private String QRCode;

    private String remark;

    /**
     * 失效期
     */
    private Date expirationDate;

    /**
     * 是否被使用
     */
    private Integer isUsed;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    private Long createUser;

    private Date createTime;

    private Long ModifyUser;

    private Date ModifyTime;

}
