package de.oose.matcher;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Split {
	String str = "1;2;3;4;5";
	String regexp = ";";
	
	public static void main(String[] args) {
		Split theApp = new Split();
		
		System.out.println(theApp.split());
		System.out.println(theApp.patternSplit());
	}
	
	public List<String> split() {
		return Arrays.asList(str.split(regexp));
	}
	
	public List<String> patternSplit() {
		Pattern pattern = Pattern.compile(regexp);
		return Arrays.asList(pattern.split(str));
	}

}