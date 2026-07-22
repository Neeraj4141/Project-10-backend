package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FoodDeliveryDTO;

public class FoodDeliveryForm extends BaseForm {

	@NotEmpty(message = "coustmerCode is required")
	private String coustmerCode;
	@NotEmpty(message = "foodName is required")
	private String foodName;
	@NotEmpty(message = "foodType is required")
	private String foodType;
	@NotEmpty(message = "address is required")
	private String address;
	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {
		FoodDeliveryDTO dto = initDTO(new FoodDeliveryDTO());
		dto.setCoustmerCode(coustmerCode);
		dto.setFoodName(foodName);
		dto.setFoodType(foodType);
		dto.setAddress(address);
		dto.setStatus(status);

		return dto;
	}

}
