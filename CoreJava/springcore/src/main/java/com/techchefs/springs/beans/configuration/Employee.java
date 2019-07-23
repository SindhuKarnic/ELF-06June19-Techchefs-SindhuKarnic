package com.techchefs.springs.beans.configuration;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	String name;
	int id;
	@Autowired
	private DeptBean deptbean;
	
	public DeptBean getDeptbean() {
		return deptbean;
	}
	public void setDeptbean(DeptBean deptbean) {
		this.deptbean = deptbean;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
