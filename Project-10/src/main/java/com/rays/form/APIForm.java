package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.APIDTO;

public class APIForm extends BaseForm {
	@NotEmpty(message = "apiName is required")
	private String apiName;
	@NotEmpty(message = "endPoint id required")
	private String endPoint;
	@NotEmpty(message = "method is required")
	private String method;
	@NotEmpty(message = "version is required")
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
	public BaseDTO getDto() {
		APIDTO dto = initDTO(new APIDTO());
		dto.setApiName(apiName);
		dto.setEndPoint(endPoint);
		dto.setMethod(method);
		dto.setVersion(version);
		return dto;
	}

}
