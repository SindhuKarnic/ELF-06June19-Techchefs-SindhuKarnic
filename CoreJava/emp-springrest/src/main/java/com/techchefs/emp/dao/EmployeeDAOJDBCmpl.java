
package com.techchefs.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techchefs.emp.dto.EmployeeInfoBean;



public final class EmployeeDAOJDBCmpl implements EmployeeDAO{
	
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() { 
		String query = "select * from EMPLOYEE_INFO";
		String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			ArrayList<EmployeeInfoBean> beans = new ArrayList<EmployeeInfoBean>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				//bean.setSalary(rs.getInt("SALARY"));
				//bean.setPhone(rs.getInt("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				//bean.setAccountNumber(rs.getInt("ACCOUNT_NUMBER"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				//bean.setDepartmentId(rs.getInt("DEPT_ID"));
				//bean.setManagerId(rs.getInt("MNGR_ID"));
				
				beans.add(bean);
			}
			return beans;

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}  


	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmployeeInfoBean> getAllSearchedEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
