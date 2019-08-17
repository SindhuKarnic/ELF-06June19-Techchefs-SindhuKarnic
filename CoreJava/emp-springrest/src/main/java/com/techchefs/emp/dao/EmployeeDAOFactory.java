package com.techchefs.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {
	@Bean("jdbc")
	public static EmployeeDAO getJdbcInstance() {
		return new EmployeeDAOJDBCmpl();
	}
	@Bean("hibernate")
	public static EmployeeDAO getHibernateInstance() {
		return new EmployeeDAOHibernateImpl();
	}
}
