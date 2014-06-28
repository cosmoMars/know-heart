package com.qubaopen.survey.entity.base;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author mars 省份代码
 */
@Entity
@Table(name = "province_code")
public class ProvinceCode extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -1757625723191983902L;

	/**
	 * 省份代码
	 */
	private String code;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 城市代码
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "provinceCode", cascade = { PERSIST, REMOVE })
	private Set<CityCode> cityCode;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CityCode> getCityCode() {
		return cityCode;
	}

	public void setCityCode(Set<CityCode> cityCode) {
		this.cityCode = cityCode;
	}

}
