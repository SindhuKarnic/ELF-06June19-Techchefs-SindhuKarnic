package com.techchefs.jdbcapplication.bean;

import lombok.Data;

@Data
public class EmployeeEducationalInfoBean {
	private int id;
	private String educationType;
	private String degreetype;
	private String branch;
	private String collegeNm;
	private String university;
	private String yop;
	private double percentage;
	private String location;

}

