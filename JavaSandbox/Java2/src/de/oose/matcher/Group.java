package de.oose.matcher;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group {
	String str = "17-25";
	String regexp = "(\\d+)-(\\d+)";
	
	public static void main(String[] args) {
		Group theApp = new Group();
		
		System.out.println(theApp.group());
	}
	
	public List<String> group() {
		List<String> elements = new ArrayList<String>();
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(str);
		
		if (matcher.matches()) {
			int count = matcher.groupCount();
			for (int i = 0; i <= count; i++) {
				elements.add(matcher.group(i));
			}
		}
		return elements;
	}

}
