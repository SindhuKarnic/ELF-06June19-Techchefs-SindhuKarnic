package com.techchefs.springintegration;

public class EmployeeDAOFactory {
	private EmployeeDAOFactory() {}
	
	public static EmployeeDAO getInstance() {
		return new EmployeeDAOHibernateImpl();
	}
}
