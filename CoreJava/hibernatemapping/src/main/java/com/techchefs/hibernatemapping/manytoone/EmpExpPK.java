package com.techchefs.hibernatemapping.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.techchefs.hibernatemapping.EmployeeInfoBean;

import lombok.Data;

@Embeddable
@Data
public class EmpExpPK implements Serializable{
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	@Column(name="companename")
	private String companeName;
}
