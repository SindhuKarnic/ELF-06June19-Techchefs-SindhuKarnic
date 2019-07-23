package com.techchefs.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	String name;
	int id;
	private DeptBean deptbean;
	public Employee(String name, int id, DeptBean deptbean) {
		super();
		this.name = name;
		this.id = id;
		this.deptbean = deptbean;
	}
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
	public void destroy() throws Exception {
		System.out.println("Destruction");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialize");
	}
	
}
