package com.qubaopen.survey.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.qubaopen.survey.entity.base.RegionCode;

/**
 * @author mars 用户收货地址表
 */
@Entity
@Table(name = "user_receive_address")
public class UserReceiveAddress extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -2294678124960735115L;

	/**
	 * 用户信息
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_info_id")
	private UserInfo userInfo;

	/**
	 * 收货人
	 */
	private String consignee;

	/**
	 * 地区代码
	 */
	@ManyToOne
	private RegionCode regionCode;

	/**
	 * 详细地址
	 */
	private String detialAddress;

	/**
	 * 电话
	 */
	private String phone;

	/**
	 * 邮政编码
	 */
	private String postCode;

	/**
	 * 删除标志位
	 */
	@Column(length = 1)
	private Integer isRemoved;

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public RegionCode getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(RegionCode regionCode) {
		this.regionCode = regionCode;
	}

	public String getDetialAddress() {
		return detialAddress;
	}

	public void setDetialAddress(String detialAddress) {
		this.detialAddress = detialAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Integer getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Integer isRemoved) {
		this.isRemoved = isRemoved;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
