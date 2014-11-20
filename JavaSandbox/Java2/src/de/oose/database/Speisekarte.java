package de.oose.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Speisekarte {
	
	List<String> gerichte = new ArrayList<String>();
	
	public static void main(String[] argv) throws Exception {
		// Lade DB Treiber
		String driver = "com.mysql.jdbc.Driver";
		Class.forName(driver).newInstance();
		
		// DB Verbindung herstellen
		String url    = "jdbc:mysql://localhost:3306/Pizzeria";
		String user   = MyProperties.getProperty("name");
		String pass   = MyProperties.getProperty("password");

		Connection con = DriverManager.getConnection(url, user, pass);

		// Mit SQL in der DB arbeiten
		Statement st  = con.createStatement();
		ResultSet res = st.executeQuery("SELECT * FROM  Pizza");
		
		Speisekarte speisekarte = new Speisekarte();
		while (res.next()) {
			int    id           = res.getInt   ("ID");
			String name         = res.getString("name");
			double preis        = res.getDouble("preis");
			String beschreibung = res.getString("beschreibung");
			String zusatzstoffe = res.getString("zusatzsstoffe");
			String row = String.format(Locale.GERMANY, "%2d  %20s %2.3g€ %70s %5s", 
					                   id, name, preis, beschreibung, 
					                   zusatzstoffe!=null?zusatzstoffe:"keine");
			System.out.println(row);
			speisekarte.gerichte.add(row);
		}
		con.close();
	}
}
