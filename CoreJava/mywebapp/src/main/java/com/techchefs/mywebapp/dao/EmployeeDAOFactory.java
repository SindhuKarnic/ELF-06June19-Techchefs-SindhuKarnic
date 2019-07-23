package com.techchefs.mywebapp.dao;

public class EmployeeDAOFactory {
	private static String dbInteractionType = "hibernate";
	
	private EmployeeDAOFactory() {}
	
	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if(dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOJDBCmpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
		}
		return dao;
	}
}
