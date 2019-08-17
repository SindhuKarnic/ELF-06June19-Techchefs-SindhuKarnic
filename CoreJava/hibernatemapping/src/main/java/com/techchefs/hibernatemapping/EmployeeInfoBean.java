package com.techchefs.hibernatemapping;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.techchefs.hibernatemapping.manytomany.TrainingInfoBean;
import com.techchefs.hibernatemapping.manytoone.EmployeeAddressInfo;
import com.techchefs.hibernatemapping.manytoone.EmployeeEducationalInfo;
import com.techchefs.hibernatemapping.manytoone.EmployeeExperienceInfoBean;
import com.techchefs.hibernatemapping.onetomany.DepartmentInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	
	//Bidirectional mapping, if foreign key is not present
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infobean")
	private EmployeeOtherInfoBean empotherinfo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empPK.infoBean")
	private List<EmployeeAddressInfo> addressInfobean;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "eduPk.infoBean")
	private List<EmployeeEducationalInfo> eduInfobean;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empExp.infoBean")
	private List<EmployeeExperienceInfoBean> expInfobean;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainbean;
	
	
	@Id
	@Column(name="id")
	private int id; 
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="salary")
	private double salary;
	@Column(name="phone")
	private long phone;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="account_number")
	private long accountNumber;
	@Column(name="email")
	private String email;
	@Column(name="designation")
	private String designation;
	@Column(name="dob")
	private Date dob;
	/*
	 * @Column(name="dept_id") private int departmentId;
	 */
	/*
	 * @Column(name="mngr_id") private int managerId;
	 */
	@Column(name="password")
	private String password;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="departmrnt_id", referencedColumnName = "dept_id")
	private DepartmentInfoBean departBean;
	
	@ManyToOne
	@JoinColumn(name="mng_id", referencedColumnName = "id")
	private EmployeeInfoBean managerId;
	
}
