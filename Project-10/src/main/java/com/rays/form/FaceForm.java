package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FaceDTO;

public class FaceForm extends BaseForm {

	@NotEmpty(message = "faceCode is required")
	private String faceCode;
	@NotEmpty(message = "userName is required")
	private String userName;
	@NotEmpty(message = "imagePath is required")
	private String imagePath;
	@NotEmpty(message = "status is required")
	private String status;

	public String getFaceCode() {
		return faceCode;
	}

	public void setFaceCode(String faceCode) {
		this.faceCode = faceCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		FaceDTO dto = initDTO(new FaceDTO());
		dto.setFaceCode(faceCode);
		dto.setUserName(userName);
		dto.setImagePath(imagePath);
		dto.setStatus(status);
		return dto;
	}

}
