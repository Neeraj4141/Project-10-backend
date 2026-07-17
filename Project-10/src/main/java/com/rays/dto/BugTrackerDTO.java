package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_bugtracker")
public class BugTrackerDTO extends BaseDTO {

	@Column(name = "title", length = 50)
	private String title;
	@Column(name = "severity", length = 50)
	private String severity;
	@Column(name = "assignedTo", length = 50)
	private String assignedTo;
	@Column(name = "status", length = 50)
	private String status;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return severity;
	}

	@Override
	public String getUniqueKey() {
		return "severity";
	}

	@Override
	public String getUniqueValue() {
		return severity;
	}

	@Override
	public String getLabel() {
		return "Bug tracker";
	}

	@Override
	public String getTableName() {
		return "bug tracker";
	}

}
