package com.qubaopen.survey.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 用户身份证资料库，将验证完的合法身份证存放在此处
 */
@Entity
@Table(name = "user_id_card")
public class UserIDCard extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -3372595247528105990L;

	/**
	 * 身份证
	 */
	private String IDCard;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 照片
	 */
	// @Lob
	// @Basic(fetch = FetchType.LAZY)
	// @JsonIgnore
	private String photoUrl;

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
