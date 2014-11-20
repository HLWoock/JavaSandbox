package de.oose.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {

	String str         = "  Rechnung  für    Firma oose";
	String regexp      = "\\s+";
	String replacement = " ";
	
	public static void main(String[] args) {
		Replace theApp = new Replace();
		System.out.println(theApp.replace());
		System.out.println(theApp.patternReplace());
	}

	private String replace() {
		return str.replaceAll(regexp, replacement);
	}
	
	private String patternReplace() {
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(str);
		
		return matcher.replaceAll(replacement).trim();
	}

}
