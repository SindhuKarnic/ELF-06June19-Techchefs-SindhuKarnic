package com.techchefs.hibernatemapping.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_addressinfo")
@Data
public class EmployeeAddressInfo implements Serializable{
	@EmbeddedId
	private EmployeeAddressPK empPK;
	
	@Column(name="address1")
	private String address1;
	@Column(name="address2")
	private String address2;
	@Column(name="landmark")
	private String landmark;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pincode")
	private int pincode;
}
