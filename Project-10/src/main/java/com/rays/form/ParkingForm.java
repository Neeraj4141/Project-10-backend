package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ParkingDTO;

public class ParkingForm extends BaseForm {

	@NotEmpty(message = "parkingCode is required")
	private String parkingCode;
	@NotEmpty(message = "parkingCode is required")
	private String vehicalNumber;
	@NotEmpty(message = "parkingCode is required")
	private String slotNumber;
	@NotEmpty(message = "parkingCode is required")
	private String status;

	public String getParkingCode() {
		return parkingCode;
	}

	public void setParkingCode(String parkingCode) {
		this.parkingCode = parkingCode;
	}

	public String getVehicalNumber() {
		return vehicalNumber;
	}

	public void setVehicalNumber(String vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}

	public String getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(String slotNumber) {
		this.slotNumber = slotNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		ParkingDTO dto = initDTO(new ParkingDTO());
		dto.setParkingCode(parkingCode);
		dto.setVehicalNumber(vehicalNumber);
		dto.setSlotNumber(slotNumber);
		dto.setStatus(status);
		return dto;
	}
}
