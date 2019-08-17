package com.techchefs.emp.dao;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.techchefs.emp.dto.EmployeeInfoBean;



@JsonRootName("emp-response")

public class EmployeeResponse {
	@JsonProperty("status-code")
	private int statusCode;
	
	private String message;
	private String decription;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public List<EmployeeInfoBean> getBeans() {
		return beans;
	}
	public void setBeans(List<EmployeeInfoBean> beans) {
		this.beans = beans;
	}
	private List<EmployeeInfoBean> beans;
}
