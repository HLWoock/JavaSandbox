package de.oose.string;

public class A_StringLiterals {

	public static void main(String[] args) {

		String hallo     = "Hallo ";
		String welt      = "Welt";
		String halloWelt = "Hallo Welt";
		
		String hw1 = hallo    + welt;
		String hw2 = "Hallo " + welt;
		String hw3 = "Hallo " + "Welt";
		
		System.out.println(hw1          == halloWelt);
		System.out.println(hw2          == halloWelt);
		System.out.println(hw3          == halloWelt);
		System.out.println(hw1.intern() == halloWelt);
	}
}
