
package com.techchefs.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import lombok.extern.java.Log;

@Log
public final class MyFirstJdbcTryWithResources {

	public static void main(String[] args) {
		String query = "select * from EMPLOYEE_INFO";
		String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			while (rs.next()) {
				log.info("  ID (PK)	===>	" + rs.getInt("ID"));
				log.info("  NAME	===>	" + rs.getString("NAME"));
				log.info("  AGE		===>		" + rs.getInt("AGE"));
				log.info("  GENDER	===>	" + rs.getString("GENDER"));
				log.info("  SALARY	===>	" + rs.getInt("SALARY"));
				log.info("  PHNUM	===>	" + rs.getInt("PHONE"));
				log.info("  JOINING_DATE ===>" + rs.getDate("JOINING_DATE"));
				log.info("  ACCOUNT_NUMBER  ===>" + rs.getInt("ACCOUNT_NUMBER"));
				log.info("  EMAIL		===>" + rs.getString("EMAIL"));
				log.info("	DESIGNATION	===>" + rs.getString("DESIGNATION"));
				log.info("  DOB		===>	" + rs.getDate("DOB"));
				log.info("  DEPT_ID(FK) ===>" + rs.getInt("DEPT_ID"));
				log.info("  MNGR_ID ===>	" + rs.getInt("MNGR_ID"));

			}

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}  


	}
}
