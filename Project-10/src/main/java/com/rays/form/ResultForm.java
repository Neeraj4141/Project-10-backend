package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ResultDTO;

public class ResultForm extends BaseForm {

	@NotEmpty(message = "studentId is required")
	private String studentId;
	@NotEmpty(message = "percentage is required")
	private String percentage;
	@NotEmpty(message = "grade is required")
	private String grade;
	@NotEmpty(message = "resultStatus is required")
	private String resultStatus;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	@Override
	public BaseDTO getDto() {
		ResultDTO dto = initDTO(new ResultDTO());
		dto.setStudentId(studentId);
		dto.setPercentage(percentage);
		dto.setGrade(grade);
		dto.setResultStatus(resultStatus);
		return dto;
	}

}
