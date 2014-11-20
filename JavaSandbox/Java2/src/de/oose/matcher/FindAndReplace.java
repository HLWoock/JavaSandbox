package de.oose.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndReplace {

	private String str    = "Hallo ${user.name}!";
	private String regexp = "\\$\\{([a-z.]+)\\}";
	public static void main(String[] args) {
		FindAndReplace theApp = new FindAndReplace();
		System.out.println(theApp.findAndReplace());
	}


	private String findAndReplace() {
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(str);
		
		StringBuffer sb = new StringBuffer();
		
		while (matcher.find()) {
			String property = System.getProperty(matcher.group(1));
			matcher.appendReplacement(sb, property);
		}
		return matcher.appendTail(sb).toString();
	}

}
