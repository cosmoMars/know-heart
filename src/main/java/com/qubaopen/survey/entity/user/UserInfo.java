package com.qubaopen.survey.entity.user;

import java.util.Date;

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
	@JoinColumn(name = "user_udid_id")
	private UserUDID userUDID;

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
	private Boolean isSharedSina;

	/**
	 * 腾讯微博软件分享
	 */
	private Boolean isSharedTencent;

	/**
	 * 微信朋友圈分享
	 */
	private Boolean isSharedWeChatFriend;

	/**
	 * QQ空间分享
	 */
	@JoinColumn(name = "is_shared_qq_space")
	private Boolean isSharedQQSpace;

	/**
	 * 微信分享
	 */
	private Boolean isSharedWeChat;

	/**
	 * 好友数量
	 */
	private int friendNum;

	/**
	 * 向萌主公开测试答案
	 */
	private Boolean isPublicAnswersToChief;

	/**
	 * 开启省流量模式
	 */
	private Boolean isProvinceFlow;

	/**
	 * 向好友公开最新动态
	 */
	private Boolean isPublicMovementToFriend;

	/**
	 * 向好友公开测试答案
	 */
	private Boolean isPublicAnswersToFriend;

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

	public int getFriendNum() {
		return friendNum;
	}

	public void setFriendNum(int friendNum) {
		this.friendNum = friendNum;
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

	public UserUDID getUserUDID() {
		return userUDID;
	}

	public void setUserUDID(UserUDID userUDID) {
		this.userUDID = userUDID;
	}

	public Boolean getIsSharedSina() {
		return isSharedSina;
	}

	public void setIsSharedSina(Boolean isSharedSina) {
		this.isSharedSina = isSharedSina;
	}

	public Boolean getIsSharedTencent() {
		return isSharedTencent;
	}

	public void setIsSharedTencent(Boolean isSharedTencent) {
		this.isSharedTencent = isSharedTencent;
	}

	public Boolean getIsSharedWeChatFriend() {
		return isSharedWeChatFriend;
	}

	public void setIsSharedWeChatFriend(Boolean isSharedWeChatFriend) {
		this.isSharedWeChatFriend = isSharedWeChatFriend;
	}

	public Boolean getIsSharedQQSpace() {
		return isSharedQQSpace;
	}

	public void setIsSharedQQSpace(Boolean isSharedQQSpace) {
		this.isSharedQQSpace = isSharedQQSpace;
	}

	public Boolean getIsSharedWeChat() {
		return isSharedWeChat;
	}

	public void setIsSharedWeChat(Boolean isSharedWeChat) {
		this.isSharedWeChat = isSharedWeChat;
	}

	public Boolean getIsPublicAnswersToChief() {
		return isPublicAnswersToChief;
	}

	public void setIsPublicAnswersToChief(Boolean isPublicAnswersToChief) {
		this.isPublicAnswersToChief = isPublicAnswersToChief;
	}

	public Boolean getIsProvinceFlow() {
		return isProvinceFlow;
	}

	public void setIsProvinceFlow(Boolean isProvinceFlow) {
		this.isProvinceFlow = isProvinceFlow;
	}

	public Boolean getIsPublicMovementToFriend() {
		return isPublicMovementToFriend;
	}

	public void setIsPublicMovementToFriend(Boolean isPublicMovementToFriend) {
		this.isPublicMovementToFriend = isPublicMovementToFriend;
	}

	public Boolean getIsPublicAnswersToFriend() {
		return isPublicAnswersToFriend;
	}

	public void setIsPublicAnswersToFriend(Boolean isPublicAnswersToFriend) {
		this.isPublicAnswersToFriend = isPublicAnswersToFriend;
	}

}
