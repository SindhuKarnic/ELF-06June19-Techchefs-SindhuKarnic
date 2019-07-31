package com.techchefs.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student")
public class StudentBean {
	@Id
	@Column(name="rollNum")
	private int rollNum;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="subject")
	private String subject;
	@Column(name="totalMarks")
	private double totalMarks;
}

