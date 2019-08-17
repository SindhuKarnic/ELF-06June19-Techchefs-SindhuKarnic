package com.techchefs.hibernatemapping.manytoone;

import java.io.Serializable;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.techchefs.hibernatemapping.EmployeeInfoBean;

@Data
@Embeddable
public class EmpEduPK implements Serializable{
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	
	@Column(name="educationType")
	private String educationType;
}
