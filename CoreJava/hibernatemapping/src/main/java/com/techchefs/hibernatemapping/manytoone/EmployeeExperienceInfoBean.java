package com.techchefs.hibernatemapping.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_experience_info")
@Data
public class EmployeeExperienceInfoBean  implements Serializable{
	
	@EmbeddedId
	private EmpExpPK empExp;
	@Column(name="designation")
	private String designation;
	@Column(name="joiningdate")
	private Date joiningDate;
	@Column(name="leavingdate")
	private Date leavingDate;
}
