package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DepartmentDTO;

public class DepartmentForm extends BaseForm {

	@NotEmpty(message = "departmentName is required")
	private String departmentName;
	@NotEmpty(message = "hodNamae is required")
	private String hodNamae;
	@NotEmpty(message = "totalFaculty is required")
	private String totalFaculty;
	@NotEmpty(message = "location is required")
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
	public BaseDTO getDto() {
		DepartmentDTO dto = initDTO(new DepartmentDTO());
		dto.setDepartmentName(departmentName);
		dto.setHodNamae(hodNamae);
		dto.setTotalFaculty(totalFaculty);
		dto.setLocation(location);
		return dto;
	}
	
	

}
