package de.oose.localisation;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;

/*	•Messages
	•Labels on GUI components
	•Online help
	•Sounds
	•Colors
	•Graphics
	•Icons
	•Dates
	•Times
	•Numbers
	•Currencies
	•Measurements
	•Phone numbers
	•Honorifics and personal titles
	•Postal addresses
	•Page layouts                      */

public class LocalizeStrings {

	static public void main(String[] args) throws UnsupportedEncodingException {
		ResourceBundle messages;
        Map<String, Locale> locales = new HashMap<String, Locale>();
        locales.put("deutsch", new Locale("de", "DE"));
        locales.put("englisch", new Locale("en", "US"));
        locales.put("french", new Locale ("fr", "FR"));
        locales.put("japanese", Locale.JAPAN);
        
        Set<Entry<String, Locale>> entries = locales.entrySet();
        for (Entry<String, Locale> entry : entries) {
        	String baseName = "de/oose/localisation/MessagesBundle";
        	messages = ResourceBundle.getBundle(baseName, 
        			                            entry.getValue());
        	System.out.println(entry.getKey() + "---->");
        	System.out.println(messages.getString("greetings"));
        	System.out.println(messages.getString("inquiry"));
        	System.out.println(messages.getString("farewell"));
		}
    }
}
