package com.techchefs.springs.beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Multiple objects
@Configuration
public class DepartmentConfig {
	@Bean(name="dev")
	public DeptBean getDepartmentDev() {
		DeptBean depbean = new DeptBean();
		depbean.setDeptId(5);
		depbean.setDeptName("dev");
		return depbean;
	}
	@Bean(name="hr")
	public DeptBean getDepartmentHR() {
		DeptBean depbean = new DeptBean();
		depbean.setDeptId(6);
		depbean.setDeptName("HR");
		return depbean;
	}
	@Bean(name="it")
	public DeptBean getDepartmentIT() {
		DeptBean depbean = new DeptBean();
		depbean.setDeptId(7);
		depbean.setDeptName("IT");
		return depbean;
	}
}
