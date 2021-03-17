package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConnectionFactory {
	private Logger log = Logger.getRootLogger();
	
	private static ConnectionFactory connection = null;
	
	public Connection establishConnection() {
		System.out.println("Attempting Connection");
		String forName = "org.postgresql.Driver";
		
		String dbName = "postgres";
		
		String defaultConnection = "jdbc:postgresql://" + System.getenv("DB_URL") + ":5432/" + dbName + "?";
		
		String dbUsername = System.getenv("DB_USERNAME");
		String dbPassword = System.getenv("DB_PASS");
		
		Properties props = new Properties();
		props.setProperty("user", dbUsername);
		props.setProperty("password", dbPassword);
		props.setProperty("currentSchema", System.getenv("DB_SCHEMA"));
		
		
		try {
			Class.forName(forName);
			
			log.info("Attempting to connecto to database");
			return DriverManager.getConnection(defaultConnection, props);
		} catch (SQLException e) {
			log.error("Error opening database", e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			log.error("ConnectionFactory.establishConnection Error", e);
		}
		
		return null;
	}
	
	public static synchronized Connection getConnection() {
		if (connection == null) {
			connection = new ConnectionFactory();
		}
		
		return connection.establishConnection();
	}
	
	//constructor
	public ConnectionFactory() {
		super();
	}
}
