package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_gymmemeber")
public class GymMemberDTO extends BaseDTO {

	@Column(name = "name", length = 50)
	private String name;
	@Column(name = "age", length = 50)
	private Long age;
	@Column(name = "plan", length = 50)
	private String plan;
	@Column(name = "mobileno", length = 50)
	private String mobileNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String getValue() {
		return name;
	}

	@Override
	public String getUniqueKey() {
		return "name";
	}

	@Override
	public String getUniqueValue() {
		return name;
	}

	@Override
	public String getLabel() {
		return "GymMember";
	}

	@Override
	public String getTableName() {
		return "Gym Member";
	}

}
