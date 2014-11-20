package de.oose.props;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Read {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		
		Set<Entry<Object, Object>> entrySet = properties.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
		}
		
		System.out.println(properties.get("hermie"));
		
	}

}
