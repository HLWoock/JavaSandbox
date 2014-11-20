package de.oose.database;

import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcedure {

	public void createProcedureShowSuppliers() throws SQLException {
		String createProcedure = null;

		String queryDrop = "DROP PROCEDURE IF EXISTS SHOW_SUPPLIERS";

		createProcedure = "create procedure SHOW_SUPPLIERS() " + "begin "
				+ "select SUPPLIERS.SUP_NAME, " + "COFFEES.COF_NAME "
				+ "from SUPPLIERS, COFFEES " + "where SUPPLIERS.SUP_ID = "
				+ "COFFEES.SUP_ID " + "order by SUP_NAME; " + "end";
		Statement stmt = null;
		Statement stmtDrop = null;

		try {
			System.out.println("Calling DROP PROCEDURE");
			stmtDrop = JDBCUtil.getStatement();
			stmtDrop.execute(queryDrop);
		} catch (SQLException e) {
			// JDBCTutorialUtilities.printSQLException(e);
		} finally {
			if (stmtDrop != null) {
				stmtDrop.close();
			}
		}

		try {
			stmt = JDBCUtil.getStatement();
			stmt.executeUpdate(createProcedure);
		} catch (SQLException e) {
//			JDBCTutorialUtilities.printSQLException(e);
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}

}
