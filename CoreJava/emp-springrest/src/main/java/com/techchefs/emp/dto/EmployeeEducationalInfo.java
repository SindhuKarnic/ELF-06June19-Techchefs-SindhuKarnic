package com.techchefs.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="employee_educational_info")
@Data
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationalInfo implements Serializable{
	
	//@XmlTransient
	//@JsonIgnore
	@EmbeddedId
	private EmpEduPK eduPk;
	
	@Column(name="degree_type")
	private String degreeType;
	@Column(name="branch")
	private String branch;
	@Column(name="college_nm")
	private String collegename;
	@Column(name="university")
	private String university;
	@Column(name="yop")
	private String yop;
	@Column(name="percentage")
	private Double percentage;
	@Column(name="location")
	private String location;
}
