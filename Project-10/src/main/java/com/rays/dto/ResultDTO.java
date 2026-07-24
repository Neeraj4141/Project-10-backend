package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "result")
public class ResultDTO extends BaseDTO{
	
	@Column(name = "studentId", length = 50)
	private String studentId;
	@Column(name = "percentage", length = 50)
	private String percentage;
	@Column(name = "grade", length = 50)
	private String grade;
	@Column(name = "resultStatus", length = 50)
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
	public String getValue() {
		return studentId;
	}

	@Override
	public String getUniqueKey() {
		return "studentId";
	}

	@Override
	public String getUniqueValue() {
		return studentId;
	}

	@Override
	public String getLabel() {
		return "Result";
	}

	@Override
	public String getTableName() {
		return "Result";
	}

}
