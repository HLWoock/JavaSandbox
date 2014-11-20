package de.oose.compare;

import java.awt.Color;
import java.util.Comparator;

import de.oose.compare.util.Reihenfolge;


public class VergleicherHelligkeit implements Comparator<Color> {
	
	private Reihenfolge reihenfolge = Reihenfolge.AUFSTEIGEND;

	public VergleicherHelligkeit() {
	}

	
	public VergleicherHelligkeit(Reihenfolge reihenfolge) {
		this.reihenfolge = reihenfolge;
	}
	

	@Override
	public int compare(Color farbe1, Color farbe2) {
		
		int hell1 = getRGB(farbe1);
		int hell2 = getRGB(farbe2);
		
		switch (reihenfolge) {
		case AUFSTEIGEND:
			return hell1 - hell2;
		case ABSTEIGEND:
			return hell2 - hell1;
		}
		
		return 0;
	}
	
	protected int getRGB(Color farbe) {
		return farbe.getRed() + farbe.getBlue() + farbe.getGreen();
	}

}
