package de.oose.basics;

public class SeltsameStrings {
	public static void main(String[] args) {
		String a = "Hello World";
		String b = "Hello World";
		
		String world = " World";
		String c = "Hello" + " World";
		String d = "Hello" + world;
		
		System.out.println(a==b);
		
		System.out.println(a==c);
		System.out.println(a==d);
		
	}
}
