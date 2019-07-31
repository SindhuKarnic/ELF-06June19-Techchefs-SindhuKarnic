package com.techchefs.hibernate.dto;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Entity
@Data
@Table(name="employee-info")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class EmployeeInfoBean {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
}
