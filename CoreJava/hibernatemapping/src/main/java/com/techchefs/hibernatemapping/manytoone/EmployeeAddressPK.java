package com.techchefs.hibernatemapping.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.techchefs.hibernatemapping.EmployeeInfoBean;

import lombok.Data;

@Data
@Embeddable
public class EmployeeAddressPK implements Serializable{
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	
	@Column(name="addressType")
	private String addressType;
}
