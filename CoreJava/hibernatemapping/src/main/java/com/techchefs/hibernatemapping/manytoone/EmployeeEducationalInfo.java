package com.techchefs.hibernatemapping.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_educational_info")
@Data
public class EmployeeEducationalInfo implements Serializable{
	
	@EmbeddedId
	private EmpEduPK eduPk;
	
	@Column(name="degreeType")
	private String degreeType;
	@Column(name="branch")
	private String branch;
	@Column(name="collegename")
	private String collegename;
	@Column(name="university")
	private String university;
	@Column(name="yop")
	private String yop;
	@Column(name="percentage")
	private double percentage;
	@Column(name="location")
	private String location;
}
