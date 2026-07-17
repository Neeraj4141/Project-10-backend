package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_face")
public class FaceDTO extends BaseDTO {

	@Column(name = "facecode", length = 50)
	private String faceCode;
	@Column(name = "username", length = 50)
	private String userName;
	@Column(name = "imagepath", length = 50)
	private String imagePath;
	@Column(name = "status", length = 50)
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
	public String getValue() {
		return faceCode;
	}

	@Override
	public String getUniqueKey() {
		return "faceCode";
	}

	@Override
	public String getUniqueValue() {
		return faceCode;
	}

	@Override
	public String getLabel() {
		return "face";
	}

	@Override
	public String getTableName() {
		return "Face";
	}

}
