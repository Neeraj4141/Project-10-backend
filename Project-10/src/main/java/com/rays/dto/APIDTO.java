package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_api")
public class APIDTO extends BaseDTO {

	@Column(name = "apiName", length = 50)
	private String apiName;
	@Column(name = "endPoint", length = 50)
	private String endPoint;
	@Column(name = "method", length = 50)
	private String method;
	@Column(name = "version", length = 50)
	private String version;

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String getValue() {
		return apiName;
	}

	@Override
	public String getUniqueKey() {
		return "apiName";
	}

	@Override
	public String getUniqueValue() {
		return apiName;
	}

	@Override
	public String getLabel() {
		return "API";
	}

	@Override
	public String getTableName() {
		return "API";
	}

}
