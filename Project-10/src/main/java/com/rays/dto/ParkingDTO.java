package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_parking")
public class ParkingDTO extends BaseDTO {
	
	@Column(name = "parkingcode", length = 50)
	private String parkingCode;
	@Column(name = "vehicalnumber", length = 50)
	private String vehicalNumber;
	@Column(name = "slotnumber", length = 50)
	private String slotNumber;
	@Column(name = "status", length = 50)
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
	public String getValue() {
		return vehicalNumber;
	}

	@Override
	public String getUniqueKey() {
		return "vehicalNumber";
	}

	@Override
	public String getUniqueValue() {
		return "vehicalNumber";
	}

	@Override
	public String getLabel() {
		return "Parking";
	}

	@Override
	public String getTableName() {
	return "st_parking";
	}

}
