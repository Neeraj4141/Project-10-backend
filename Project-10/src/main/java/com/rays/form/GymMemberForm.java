package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.GymMemberDTO;

public class GymMemberForm extends BaseForm {

	@NotEmpty(message = "name is required")
	private String name;
	@NotNull(message = "name is required")
	private Long age;
	@NotEmpty(message = "plan is required")
	private String plan;
	@NotEmpty(message = "mobileNo is required")
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
	public BaseDTO getDto() {

		GymMemberDTO dto = initDTO(new GymMemberDTO());

		dto.setName(name);
		dto.setAge(age);
		dto.setPlan(plan);
		dto.setMobileNo(mobileNo);

		return dto;
	}

}
