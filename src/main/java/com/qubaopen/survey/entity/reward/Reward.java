package com.qubaopen.survey.entity.reward;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * 奖品表
 * Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "REWARD")
public class Reward  extends AbstractPersistable<Long> {

    private String name;

    /**
     * 奖品类型  例：兑奖券类  充值卡类 现金红包等
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private RewardType rewardType;

    /**
     * 库存剩余数量
     */
    private Integer remainAmount;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")

    private Integer isRemoved;

    private Long createUser;

    private Date createTime;

    private Long ModifyUser;

    private Date ModifyTime;

}
