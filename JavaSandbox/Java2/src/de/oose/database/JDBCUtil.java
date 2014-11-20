package de.oose.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUtil {
	private static Connection connection = null;
	private static Statement  statement  = null;
	
	static {
		try {
			Class.forName("org.hsqldb.jdbcDriver").newInstance();
			String url = "jdbc:hsqldb:file:dataJDBC/testdb;shutdown=true";
			connection = DriverManager.getConnection(url, "sa", "");
			
			statement = connection.createStatement();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	static {
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	public static Statement getStatement() {
		return statement;
	}
}
