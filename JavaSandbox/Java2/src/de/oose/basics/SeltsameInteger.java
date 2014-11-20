package de.oose.basics;

public class SeltsameInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i1;
		Integer i2;
		for (int i = 126; i < 130; i++) {
			i1 = i;
		    i2 = i;
			System.out.println(i + ": " + (i1 == i2));
		}

	}

}
