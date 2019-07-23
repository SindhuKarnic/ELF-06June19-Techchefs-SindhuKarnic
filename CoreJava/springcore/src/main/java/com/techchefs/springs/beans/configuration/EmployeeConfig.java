package com.techchefs.springs.beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(DeptConfig.class)
@Import(DepartmentConfig.class)
public class EmployeeConfig {
	@Bean
	public Employee2 getEmployeeBean() {
		Employee2 empbean = new Employee2();
		empbean.setId(1);
		empbean.setName("aaaa");
		return empbean;
	}
	
}
