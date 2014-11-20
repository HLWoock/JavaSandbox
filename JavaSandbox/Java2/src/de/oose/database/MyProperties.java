/**
 * 
 */
package de.oose.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author HermannW
 * 
 */
public class MyProperties {

	static Properties properties = null;

	public static String getProperty(String key) throws IOException {
		if (properties == null) {
			properties = new Properties();
			String propertyFile = "/Dokumente und Einstellungen/HermannW/workspace_helios/Java2/src/de/oose/database/mysql.properties";
			FileInputStream stream = new FileInputStream(propertyFile);
			properties.load(stream);
			stream.close();
		}
		String value = properties.getProperty(key);

		return value;
	}

	public static void main(String[] args) throws IOException {
		String property = getProperty("name");
		System.out.println(property);
	}
}
