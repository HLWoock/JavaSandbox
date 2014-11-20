package de.oose.basics;

public class FehlerhafteForSchleife {
	public static void main(String[] args) {
		double d = 0;
		for (int i = 0; i < 10; i++) {
			d += 0.1;
		}
		System.out.println(d);
		
		float f = 0;
		for (int i = 0; i < 10; i++) {
			f += 0.1;
		}
		System.out.println(f);
	}
}
