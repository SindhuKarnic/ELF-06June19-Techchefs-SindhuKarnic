package com.techchefs.jdbcapplication.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.gjt.mm.mysql.Driver;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class MyfirstJdbcProg {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool = null;
		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();
			
			String query = "select * from EMPLOYEE_INFO";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				pool.returnConnectionToPool(con);
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
