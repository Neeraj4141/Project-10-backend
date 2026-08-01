package com.rays.form;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ScholarshipDTO;

public class ScholarshipForm extends BaseForm {

	@NotEmpty(message = "scholarshipName is Required")
	private String scholarshipName;
	@NotEmpty(message = "amount is Required")
	private String amount;
	@NotEmpty(message = "eligibility is Required")
	private String eligibility;
	@NotNull(message = "lastDate is Required")
	private Date lastDate;

	public String getScholarshipName() {
		return scholarshipName;
	}

	public void setScholarshipName(String scholarshipName) {
		this.scholarshipName = scholarshipName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	@Override
	public BaseDTO getDto() {
		ScholarshipDTO dto = initDTO(new ScholarshipDTO());
		dto.setScholarshipName(scholarshipName);
		dto.setAmount(amount);
		dto.setEligibility(eligibility);
		dto.setLastDate(lastDate);

		return dto;
	}

}
