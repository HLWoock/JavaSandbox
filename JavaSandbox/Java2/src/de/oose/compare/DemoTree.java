package de.oose.compare;


import java.awt.Color;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class DemoTree {

	public static void main(String[] args) {
		Set<Color> farbBaum = new TreeSet<Color>(new VergleicherRGB());
		
		Random zufall = new Random();
		
		for (int i=0; i<58; ++i) {
			farbBaum.add(new Color(zufall.nextInt(255), zufall.nextInt(255), zufall.nextInt(255)));
		}

		
		for (Color color : farbBaum) {
			System.out.println(color);
		}
		
		DemoCollectionsSort.zeigeFarbenInFenster(farbBaum);
	}

}
