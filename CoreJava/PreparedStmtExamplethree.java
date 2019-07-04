
package com.techchefs.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public final class PreparedStmtExamplethree {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			
			log.info("Connection=========="+con.getClass());
			String query = "insert into EMPLOYEE_INFO "
							+ "values(?, ?, ?, ?, ?, ?, "
							+ "?, ?, ?, ?, ?, "
							+ "?, ? )";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setInt(3, Integer.parseInt(args[2]));
			stmt.setString(4, args[3]);
			stmt.setDouble(5, Double.parseDouble(args[4]));
			stmt.setInt(6, Integer.parseInt(args[5]));
			stmt.setString(7, args[6]);
			stmt.setInt(8, Integer.parseInt(args[7]));
			stmt.setString(9, args[8]);
			stmt.setString(10, args[9]);
			stmt.setString(11, args[10]);
			stmt.setInt(12, Integer.parseInt(args[11]));
			stmt.setInt(13, Integer.parseInt(args[12]));
			int rows = stmt.executeUpdate();
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
