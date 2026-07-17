package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BloodDTO;

public class BloodForm extends BaseForm {

	@NotEmpty(message = "name is  required")
	private String name;
	@NotEmpty(message = "bloodGroup is  required")
	private String bloodGroup;
	@NotEmpty(message = "city is  required")
	private String city;
	@NotEmpty(message = "mobileNo is  required")
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
	public BaseDTO getDto() {

		BloodDTO dto = initDTO(new BloodDTO());

		dto.setName(name);
		dto.setBloodGroup(bloodGroup);
		dto.setCity(city);
		dto.setMobileNo(mobileNo);
		
		return dto;
	}
}
