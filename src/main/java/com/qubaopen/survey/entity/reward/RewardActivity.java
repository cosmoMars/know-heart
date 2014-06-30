package com.qubaopen.survey.entity.reward;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * 兑奖活动
 * Created by duel on 2014/6/27.
 */
@Entity
@Table(name = "REWARD_ACTIVITY")
public class RewardActivity extends AbstractPersistable<Long> {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Reward reward;

    /**
     * 活动标题
     */
    private String title;

    /**
     * 活动详细介绍
     */
    private String content;

    private Date startTime;

    private Date endTime;

    private Integer requireGold;

    /**
     * 活动状态   上线中 已下线等
     */
    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer status;

    /**
     * 活动总共可被参与的次数限制
     */
    private Integer totalCountLimit;

    /**
     * 活动目前参与次数
     */
    private Integer currentCount;

    /**
     * 每人可以参与的次数限制  0为不限制
     */
    private Integer eachCountLimit;

    /**
     * 活动图片
     */
    private String picUrl;

    /**
     * 详细活动大图
     */
    private String pictureUrl;

    @Column(columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isRemoved;

    private Long createUser;

    private Date createTime;

    private Long ModifyUser;

    private Date ModifyTime;

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getRequireGold() {
        return requireGold;
    }

    public void setRequireGold(Integer requireGold) {
        this.requireGold = requireGold;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalCountLimit() {
        return totalCountLimit;
    }

    public void setTotalCountLimit(Integer totalCountLimit) {
        this.totalCountLimit = totalCountLimit;
    }

    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    public Integer getEachCountLimit() {
        return eachCountLimit;
    }

    public void setEachCountLimit(Integer eachCountLimit) {
        this.eachCountLimit = eachCountLimit;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
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
