package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_vendor")
public class VendorDTO extends BaseDTO {

	@Column(name = "vendorename", length = 50)
	public String vendorName;
	@Column(name = "city", length = 50)
	public String city;
	@Column(name = "mobileno", length = 50)
	public String mobileNo;
	@Column(name = "category", length = 50)
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
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "vendorName";
	}

	@Override
	public String getUniqueValue() {
		return vendorName;
	}

	@Override
	public String getLabel() {
		return "Vendor";
	}

	@Override
	public String getTableName() {
		return "Vendor";
	}

}
