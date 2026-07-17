package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "st_blood")
public class BloodDTO extends BaseDTO{
	
	@Column(name = "name", length = 50)
	private String name;
	@Column(name = "bloodGroup", length = 50)
	private String bloodGroup;
	@Column(name = "city", length = 50)
	private String city;
	@Column(name = "mobileNo", length = 50)
	private String mobileNo;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String getValue() {
		return city;
	}

	@Override
	public String getUniqueKey() {
		return "city";
	}

	@Override
	public String getUniqueValue() {
		return city;
	}

	@Override
	public String getLabel() {
		return "Blood";
	}

	@Override
	public String getTableName() {
		return "Blood";
	}

	
}
