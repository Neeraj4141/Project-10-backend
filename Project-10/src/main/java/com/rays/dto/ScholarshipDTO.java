package com.rays.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * @author Neeraj Mewada
 *
 */
@Entity
@Table(name = "scholarship")
public class ScholarshipDTO extends BaseDTO {

	@Column(name = "scholarshipName", length = 50)
	private String scholarshipName;
	@Column(name = "amount", length = 50)
	private String amount;
	@Column(name = "eligibility", length = 50)
	private String eligibility;
	@Column(name = "lastDate")
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
	public String getValue() {
		return scholarshipName;
	}

	@Override
	public String getUniqueKey() {
		return "scholarshipName";
	}

	@Override
	public String getUniqueValue() {
		return scholarshipName;
	}

	@Override
	public String getLabel() {
		return "Scholarship";
	}

	@Override
	public String getTableName() {
		return "scholarship";
	}

}
