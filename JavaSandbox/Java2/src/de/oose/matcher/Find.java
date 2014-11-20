package de.oose.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {
	String str = "Rechnung für OOSE und CO";
	String regexp = "\\p{Lu}{2,}"; // mindestens 2 Großbuchstaben
	
	public static void main(String[] args) {
		Find theApp = new Find();
		
		theApp.find();
	}

	private void find() {
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()) {
			System.out.println(str.substring(matcher.start(), 
					                         matcher.end()));
		}
	}
}
