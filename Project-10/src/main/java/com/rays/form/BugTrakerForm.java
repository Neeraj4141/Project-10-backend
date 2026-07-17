package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BugTrackerDTO;

public class BugTrakerForm extends BaseForm {

	@NotEmpty(message = "title is required")
	private String title;
	@NotEmpty(message = "severity is required")
	private String severity;
	@NotEmpty(message = "assignedTo is required")
	private String assignedTo;
	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {
		BugTrackerDTO dto = initDTO(new BugTrackerDTO());
		dto.setTitle(title);
		dto.setAssignedTo(assignedTo);
		dto.setSeverity(severity);
		dto.setSeverity(severity);
		return dto;
	}

}
