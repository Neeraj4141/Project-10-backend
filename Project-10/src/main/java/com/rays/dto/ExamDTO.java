package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_exam")
public class ExamDTO extends BaseDTO {

	@Column(name = "subjectname", length = 50)
	private String subjectName;
	@Column(name = "examdate", length = 50)
	private Date examDate;
	@Column(name = "totalmarks")
	private Long totalMarks;
	@Column(name = "passingmarks")
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
	public String getValue() {
		return subjectName;
	}

	@Override
	public String getUniqueKey() {
		return "subjectName";
	}

	@Override
	public String getUniqueValue() {
		return subjectName;
	}

	@Override
	public String getLabel() {
		return "Exam";
	}

	@Override
	public String getTableName() {
		return "Exam";
	}

}
