package com.techchefs.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Data
@Table(name="employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable{
	
	//@XmlTransient
	@JsonIgnore
	@Id
	@OneToOne
	@JoinColumn(name="ID")
	//@PrimaryKeyJoinColumn(name="id")
	private EmployeeInfoBean infobean;
	
	/*
	 * @Id
	 * 
	 * @Column(name="id") private int id;
	 */
	@Column(name="pan")
	private String pan;
	@Column(name="ismarried")
	private String ismarried;
	@Column(name="blood_group")
	private String bloodGroup;
	@Column(name="ischallenged")
	private Boolean ischallenged;
	@Column(name="emergency_contact_number")
	private Long emergencyContactNumber;
	@Column(name="emergency_contact_name")
	private String emergencyContactName;
	@Column(name="nationality")
	private String nationality;
	@Column(name="religion")
	private String religion;
	@Column(name="father_nm")
	private String fatherNm;
	@Column(name="mother_nm")
	private String motherNm;
	@Column(name="spouse_nm")
	private String spouseNm;
	@Column(name="passport")
	private String passport;
	@Column(name="adhar")
	private Long adhar;

}



