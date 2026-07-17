package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_examination")
public class ExaminationDTO extends BaseDTO {

	@Column(name = "subject", length = 50)
	private String subject;
	@Column(name = "examdate")
	private Date examDate;
	@Column(name = "duraation", length = 50)
	private String duration;
	@Column(name = "totalmarks")
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
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "subject";
	}

	@Override
	public String getUniqueValue() {
		return subject;
	}

	@Override
	public String getLabel() {
		return subject;
	}

	@Override
	public String getTableName() {
		return "Examination";
	}

}
