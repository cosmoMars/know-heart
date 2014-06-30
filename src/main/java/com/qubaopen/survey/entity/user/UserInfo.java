package com.qubaopen.survey.entity.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户信息表
 */
@Entity
@Table(name = "user_info")
public class UserInfo extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 3275487545418109500L;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 昵称
	 */
	private String nickName;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 出生时间
	 */
	private Date birthday;

	/**
	 * 血型
	 */
	private String bloodType;

	/**
	 * 头像URL
	 */
	private String avatarUrl;

	/**
	 * uuid
	 */
	@OneToOne
	@JoinColumn(name = "udid_id")
	private UDID udid;

	/**
	 * 用户配额
	 */
	@OneToOne
	@JoinColumn(name = "user_quota_id")
	private UserQuota userQuota;

	/**
	 * 用户金币
	 */
	@OneToOne
	@JoinColumn(name = "user_gold_id")
	private UserGold userGold;

	/**
	 * 用户验证码
	 */
	@OneToOne
	@JoinColumn(name = "user_check_code_id")
	private UserCheckCode userCheckCode;

	/**
	 * 新浪微博软件分享
	 */
	@Column(length = 1)
	private Integer isSharedSina;

	/**
	 * 腾讯微博软件分享
	 */
	@Column(length = 1)
	private Integer isSharedTencent;

	/**
	 * 微信朋友圈分享
	 */
	@Column(length = 1)
	private Integer isSharedWeChatFriend;

	/**
	 * QQ空间分享
	 */
	@Column(length = 1)
	@JoinColumn(name = "is_shared_qq_space")
	private Integer isSharedQQSpace;

	/**
	 * 微信分享
	 */
	@Column(length = 1)
	private Integer isSharedWeChat;

	/**
	 * 好友数量
	 */
	private int friendNum;

	/**
	 * 向萌主公开测试答案
	 */
	@Column(length = 1)
	private Integer isPublicAnswersToChief;

	/**
	 * 开启省流量模式
	 */
	@Column(length = 1)
	private Integer isProvinceFlow;

	/**
	 * 向好友公开最新动态
	 */
	@Column(length = 1)
	private Integer isPublicMovementToFriend;

	/**
	 * 向好友公开测试答案
	 */
	@Column(length = 1)
	private Integer isPublicAnswersToFriend;

	/**
	 * 创建人
	 */
	private Long createUser;

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	/**
	 * 修改人
	 */
	private Long modifyUser;

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Integer getIsSharedSina() {
		return isSharedSina;
	}

	public void setIsSharedSina(Integer isSharedSina) {
		this.isSharedSina = isSharedSina;
	}

	public Integer getIsSharedTencent() {
		return isSharedTencent;
	}

	public void setIsSharedTencent(Integer isSharedTencent) {
		this.isSharedTencent = isSharedTencent;
	}

	public Integer getIsSharedWeChatFriend() {
		return isSharedWeChatFriend;
	}

	public void setIsSharedWeChatFriend(Integer isSharedWeChatFriend) {
		this.isSharedWeChatFriend = isSharedWeChatFriend;
	}

	public Integer getIsSharedQQSpace() {
		return isSharedQQSpace;
	}

	public void setIsSharedQQSpace(Integer isSharedQQSpace) {
		this.isSharedQQSpace = isSharedQQSpace;
	}

	public Integer getIsSharedWeChat() {
		return isSharedWeChat;
	}

	public void setIsSharedWeChat(Integer isSharedWeChat) {
		this.isSharedWeChat = isSharedWeChat;
	}

	public int getFriendNum() {
		return friendNum;
	}

	public void setFriendNum(int friendNum) {
		this.friendNum = friendNum;
	}

	public Integer getIsPublicAnswersToChief() {
		return isPublicAnswersToChief;
	}

	public void setIsPublicAnswersToChief(Integer isPublicAnswersToChief) {
		this.isPublicAnswersToChief = isPublicAnswersToChief;
	}

	public Integer getIsProvinceFlow() {
		return isProvinceFlow;
	}

	public void setIsProvinceFlow(Integer isProvinceFlow) {
		this.isProvinceFlow = isProvinceFlow;
	}

	public Integer getIsPublicMovementToFriend() {
		return isPublicMovementToFriend;
	}

	public void setIsPublicMovementToFriend(Integer isPublicMovementToFriend) {
		this.isPublicMovementToFriend = isPublicMovementToFriend;
	}

	public Integer getIsPublicAnswersToFriend() {
		return isPublicAnswersToFriend;
	}

	public void setIsPublicAnswersToFriend(Integer isPublicAnswersToFriend) {
		this.isPublicAnswersToFriend = isPublicAnswersToFriend;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public UserQuota getUserQuota() {
		return userQuota;
	}

	public void setUserQuota(UserQuota userQuota) {
		this.userQuota = userQuota;
	}

	public UserGold getUserGold() {
		return userGold;
	}

	public void setUserGold(UserGold userGold) {
		this.userGold = userGold;
	}

	public UserCheckCode getUserCheckCode() {
		return userCheckCode;
	}

	public void setUserCheckCode(UserCheckCode userCheckCode) {
		this.userCheckCode = userCheckCode;
	}

	public UDID getUdid() {
		return udid;
	}

	public void setUdid(UDID udid) {
		this.udid = udid;
	}

}
