package de.oose.string;

public class B_IntegerLiterals {

	public static void main(String[] args) {
		for (Integer i = 120, k = 120; i <= 130; i++, k++) {
			if (k.equals(i))
				System.out.println(i + " == " + k);
		}

	}

}
