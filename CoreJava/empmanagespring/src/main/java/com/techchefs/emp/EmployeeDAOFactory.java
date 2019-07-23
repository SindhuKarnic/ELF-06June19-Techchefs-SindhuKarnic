package com.techchefs.emp;

import com.techchefs.emp.EmployeeDAO;

public class EmployeeDAOFactory {
	
	private EmployeeDAOFactory() {}
	
	public static EmployeeDAO getInstance() {
		
		EmployeeDAO dao  = new EmployeeDAOHibernateImpl();
		return dao;
	}
}
