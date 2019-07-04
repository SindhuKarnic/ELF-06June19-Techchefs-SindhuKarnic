package com.techchefs.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class StatementExampleOne {

	public static void main(String[] args) {
		Driver driver = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
				Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db";
			//con = DriverManager.getConnection(dbUrl);
			con = DriverManager.getConnection(dbUrl, "root", "root");
			
			log.info("Connection=========="+con.getClass());
			String query = "select * from EMPLOYEE_INFO "
							+ "where ID = 1";
			log.info(""+query);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				log.info("  ID (PK)	===>	" + rs.getInt(1));
				log.info("  NAME	===>	" + rs.getString(2));
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
		} finally {

			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}
}
