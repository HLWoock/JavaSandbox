package de.oose.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E_RegExpr {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// Regular Expression
		boolean b = "Hallo Welt 123".matches("\\w+\\s\\w*\\s\\d\\d\\d");
		System.out.println(b);
		
		// Split String
		String[] strings = "Hallo Welt 123".split(" ");
		System.out.println(Arrays.asList(strings));
		
		// Read Properties
		String fileName = "C:/Excel.txt";
		Scanner scanner = new Scanner(new File(fileName)).useDelimiter(";");
		System.out.println("\nSpeisekarte" +
				           "\n====================");
		while (scanner.hasNext()){
			System.out.println(scanner.next()+ "\t€" + scanner.nextDouble());
		}
		
		// Groups
		Pattern pattern = Pattern.compile("((\\w+)-(\\d*))*");
		Matcher matcher = pattern.matcher("Hallo-123 Welt-123");
		while(matcher.find()){
			System.out.println();
			System.out.println("Group 0: " + matcher.group(0));
			System.out.println("Group 1: " + matcher.group(1));
			System.out.println("Group 2: " + matcher.group(2));
			System.out.println("Group 3: " + matcher.group(3));
		}
		
		// Replace
		String s = "Hallo-123 Welt-456".replaceAll("(\\w+)-(\\d*)", "#$2#");
		System.out.println(s);
		
	}
}
