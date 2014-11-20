package de.oose.compare;

import java.awt.Color;


public class DemoCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VergleicherHelligkeit vergleicher = new VergleicherHelligkeit();
		System.out.println(vergleicher.compare(Color.white, Color.white));

	}

}
