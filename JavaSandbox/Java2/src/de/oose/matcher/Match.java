package de.oose.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
	String str = "X";
	String regexp = "[A-Z]";
	
	public static void main(String[] args) {
		Match theApp = new Match();
		
		System.out.println(theApp.match());
		System.out.println(theApp.compile());
		System.out.println(theApp.lookingAt());
	}
	
	public boolean match() {
		return str.matches(regexp);
	}
	
	public boolean compile() {
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	public boolean lookingAt() {
		Pattern pattern    = Pattern.compile(regexp);
		Matcher matcher    = pattern.matcher("Rechnung");
		
		boolean matches    = matcher.matches();   // false
		boolean startswith = matcher.lookingAt(); // true
		
		return startswith;
	}
}
