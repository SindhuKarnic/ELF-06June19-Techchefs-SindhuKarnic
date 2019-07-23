package com.techchefs.empmanage;

import com.techchefs.empmanage.EmployeeDAO;

public class EmployeeDAOFactory {
	
	private EmployeeDAOFactory() {}
	
	public static EmployeeDAO getInstance() {
		
		EmployeeDAO dao  = new EmployeeDAOHibernateImpl();
		return dao;
	}
}
