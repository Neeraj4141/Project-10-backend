package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table
public class FoodDeliveryDTO extends BaseDTO {

	@Column(name = "coustmerCode", length = 50)
	private String coustmerCode;
	@Column(name = "foodName", length = 50)
	private String foodName;
	@Column(name = "foodType", length = 50)
	private String foodType;
	@Column(name = "address", length = 50)
	private String address;
	@Column(name = "status", length = 50)
	private String status;

	public String getCoustmerCode() {
		return coustmerCode;
	}

	public void setCoustmerCode(String coustmerCode) {
		this.coustmerCode = coustmerCode;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return coustmerCode;
	}

	@Override
	public String getUniqueKey() {
		return "coustmerCode";
	}

	@Override
	public String getUniqueValue() {
		return coustmerCode;
	}

	@Override
	public String getLabel() {
		return "CoustmerCode";
	}

	@Override
	public String getTableName() {
		return "FoodDelivery";
	}

}
