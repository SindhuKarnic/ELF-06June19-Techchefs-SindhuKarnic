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
public final class StatementExampleTwo {

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
			String query = "insert into EMPLOYEE_INFO "
							+ "values(6, 'Amy', 25, 'female', 25000, 1111111811, "
							+ "'2019-01-10', 222222, 'amy@mail.com', 'hr', '1992-09-04', "
							+ "102, 7 )";
			stmt = con.createStatement();
			int rows = stmt.executeUpdate(query);
			log.info(""+rows);
			

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
