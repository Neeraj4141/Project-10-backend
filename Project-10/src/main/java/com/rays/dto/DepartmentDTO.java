package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import com.rays.common.BaseDTO;

@Entity
@Table(name = "Department")
public class DepartmentDTO extends BaseDTO {

	@Column(name = "depatmentName", length = 50)
	private String departmentName;
	@Column(name = "hodNamae", length = 50)
	private String hodNamae;
	@Column(name = "totalFaculty", length = 50)
	private String totalFaculty;
	@Column(name = "location", length = 50)
	private String location;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHodNamae() {
		return hodNamae;
	}

	public void setHodNamae(String hodNamae) {
		this.hodNamae = hodNamae;
	}

	public String getTotalFaculty() {
		return totalFaculty;
	}

	public void setTotalFaculty(String totalFaculty) {
		this.totalFaculty = totalFaculty;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String getValue() {
		return departmentName;
	}

	@Override
	public String getUniqueKey() {
		return "departmentName";
	}

	@Override
	public String getUniqueValue() {
		return departmentName;
	}

	@Override
	public String getLabel() {
		return "Department";
	}

	@Override
	public String getTableName() {
		return "Department";
	}

}
