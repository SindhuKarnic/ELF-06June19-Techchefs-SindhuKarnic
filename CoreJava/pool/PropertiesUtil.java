package com.techchefs.jdbcapplication.pool;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil { 
	
	private static PropertiesUtil ref = null;
	Properties properties = null;
	
	public static PropertiesUtil getPropertyUtil() throws Exception {
		if(ref == null) {
			ref = new PropertiesUtil();
		}
		return ref;
	}

	private PropertiesUtil() throws Exception{
		FileInputStream fin = new FileInputStream("dbConnection.properties");
		properties = new Properties();
		properties.load(fin);
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
		
}
