package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ExaminationDTO;

public class ExaminationForm extends BaseForm {

	@NotEmpty(message = "subject id required")
	private String subject;
	@NotNull(message = "examDate is required")
	private Date examDate;
	@NotEmpty(message = "duration is required")
	private String duration;
	@NotNull(message = "totalmarks is required")
	private Long totalMarks;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Long getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Long totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public BaseDTO getDto() {
		ExaminationDTO dto = initDTO(new ExaminationDTO());
		dto.setSubject(subject);
		dto.setExamDate(examDate);
		dto.setDuration(duration);
		dto.setTotalMarks(totalMarks);
		return dto;
	}

}
