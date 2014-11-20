package de.oose.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class F_Matching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b1 = "Hallo Welt 123".matches("\\w+\\s\\w*\\s\\d\\d\\d");
		System.out.println(b1);
		boolean b2 = Pattern.matches("\\w+\\s\\w*\\s\\d\\d\\d", "Hallo Welt 123");
		System.out.println(b2);
	}

}
