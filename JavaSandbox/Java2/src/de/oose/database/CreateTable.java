package de.oose.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	Statement stmt;
	Connection con;

	/*
	 * CREATE TABLE Employees ( Employee_ID INTEGER, Name VARCHAR(30) );
	 */
	public void createLog_Entries() {
		Connection con = JDBCUtil.getConnection();

		String createString;
		createString = "create table LOG_ENTRIES (" 
			                      + "ID INTEGER, "
				                  + "TEXT VARCHAR(30))";
		try {
			stmt = JDBCUtil.getStatement();
			stmt.executeUpdate(createString);
			stmt.close();
			con.close();

		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}
