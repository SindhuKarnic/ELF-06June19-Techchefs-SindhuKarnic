package com.techchefs.hibernatemapping.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.techchefs.hibernatemapping.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name="training_info")
public class TrainingInfoBean implements Serializable{
	
	@Id
	@Column(name="courseid")
	private int courseId; 
	@Column(name="name")
	private String name; 
	@Column(name="duration")
	private int duration; 
	@Column(name="coursetype")
	private String courseType; 
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_traininginfo", joinColumns = {@JoinColumn(name="courseid")},
	inverseJoinColumns = {@JoinColumn(name="id")})
	List<EmployeeInfoBean> infoBeans;
}
