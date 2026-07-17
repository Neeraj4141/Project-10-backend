package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VendorDTO;

public class VendorForm extends BaseForm {

	@NotEmpty(message = "vendorName is required")
	public String vendorName;
	@NotEmpty(message = "city Name is required")
	public String city;
	@NotEmpty(message = "mobileNo Name is required")
	public String mobileNo;
	@NotEmpty(message = "category Name is required")
	public String category;

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public BaseDTO getDto() {
		VendorDTO dto = initDTO(new VendorDTO());
		dto.setVendorName(vendorName);
		dto.setCity(city);
		dto.setMobileNo(mobileNo);
		dto.setCategory(category);
		return dto;
	}

}
