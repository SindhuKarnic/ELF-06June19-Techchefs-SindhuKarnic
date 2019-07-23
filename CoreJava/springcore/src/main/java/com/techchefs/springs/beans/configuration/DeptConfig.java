package com.techchefs.springs.beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeptConfig {
	@Bean
	public DeptBean getDepartmentBean() {
		DeptBean depbean = new DeptBean();
		depbean.setDeptId(5);
		depbean.setDeptName("aaagggga");
		return depbean;
	}
}
