package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="employee_experience_info")
@Data
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperienceInfoBean  implements Serializable{
	
	//@XmlTransient
	//@JsonIgnore
	@EmbeddedId
	private EmpExpPK empExp;
	@Column(name="designation")
	private String designation;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="leaving_date")
	private Date leavingDate;
}
