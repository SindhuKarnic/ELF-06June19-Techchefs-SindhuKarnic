package com.tc.springboot.dto;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

//@XmlRootElement(name="employee-info-bean")
@JsonRootName(value="employee-info-bean")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{

	@Id
	//@Column(name="id")
	private Integer id; 
	@Column(name="name")
	private String name;
	@Column(name="age")
	private Integer age;
	@Column(name="gender")
	private String gender;
	@Column(name="salary")
	private Double salary;
	@Column(name="phone")
	private Long phone;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="account_number")
	private Long accountNumber;
	@Column(name="email")
	private String email;
	@Column(name="designation")
	private String designation;
	@Column(name="dob")
	private Date dob;
	@Column(name="dept_id") 
	private Integer departmentId;
	@Column(name="password")
	private String password;

	@ManyToOne(cascade = CascadeType.PERSIST)
	//@XmlTransient
	//@JsonIgnore
	@JoinColumn(name="mngr_id", referencedColumnName = "id")
	private EmployeeInfoBean managerId;

	//Bidirectional mapping, if foreign key is not present
	//@XmlElement(name="other-info")
	@JsonProperty(value="otherInfo")
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infobean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private EmployeeOtherInfoBean otherInfo;
	
	//@XmlElement(name="address-info")
	@JsonProperty(value="address-info")
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empPK.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeAddressInfo> addressInfobean;
	
	//@XmlElement(name="edu-info")
	@JsonProperty(value="edu-info")
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "eduPk.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeEducationalInfo> eduInfobean;
	
	//@XmlElement(name="exp-info")
	@JsonProperty(value="exp-info")
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empExp.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeExperienceInfoBean> expInfobean;

	
}
