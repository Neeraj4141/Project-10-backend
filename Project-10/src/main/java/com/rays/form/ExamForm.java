package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ExamDTO;

public class ExamForm extends BaseForm {

	@NotEmpty(message = "SubjectName is required")
	private String subjectName;
	@NotNull(message = "ExamDate is required")
	private Date examDate;
	@NotNull(message = "TotalMarks is required")
	private Long totalMarks;
	@NotNull(message = "PassingMarks is required")
	private Long passingMarks;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Long getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Long totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Long getPassingMarks() {
		return passingMarks;
	}

	public void setPassingMarks(Long passingMarks) {
		this.passingMarks = passingMarks;
	}

	@Override
	public BaseDTO getDto() {
		ExamDTO dto = initDTO(new ExamDTO());
		dto.setSubjectName(subjectName);
		dto.setExamDate(examDate);
		dto.setTotalMarks(totalMarks);
		dto.setPassingMarks(passingMarks);
		return dto;
	}

}
