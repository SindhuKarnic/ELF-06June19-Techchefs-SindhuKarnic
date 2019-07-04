package com.techchefs.jdbcapplication.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool{
	private Vector<Connection> pool;
	private static ConnectionPool poolRef = null;
	private int poolSize;
	private String dbUrl;
	private String userNm;
	private String password;
	private String dbName;
	
	public static ConnectionPool getConnectionPool() throws Exception {
		if(poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	private ConnectionPool() throws Exception{
		loadProperties();
		initialisePool();
	}
	
	public Connection getConnectionFromPool() {
		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}
	
	private void loadProperties() throws Exception{
		poolSize =  Integer.parseInt(PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.POOL_SIZE));
		dbUrl = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DB_URL);
		userNm = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.USER_NM);
		password = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.PASSWORD);
		dbName = PropertiesUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DB_NAME);
	}

	private void initialisePool() throws Exception{
		pool = new Vector<>();
		Connection con = null;
		
		Class.forName(dbName);
		for(int i = 0;  i < poolSize; i++) {
			con = DriverManager.getConnection(dbUrl, userNm, password);
			pool.add(con);
		}
	}

	
}
