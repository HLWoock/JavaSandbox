package de.oose.compare;

import java.awt.Color;
import java.util.Comparator;

import de.oose.compare.util.Reihenfolge;


public class VergleicherRGB implements Comparator<Color> {
	
	private Reihenfolge reihenfolge = Reihenfolge.AUFSTEIGEND;

	public VergleicherRGB() {
	}

	
	public VergleicherRGB(Reihenfolge reihenfolge) {
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
		int red   = farbe.getRed()   - (farbe.getBlue() + farbe.getGreen());
	    int green = farbe.getGreen() - (farbe.getBlue() + farbe.getRed());
	    int blue  = farbe.getBlue()  - (farbe.getRed()  + farbe.getGreen());
		return ((red * 256) + green) * 256 + blue;
		//return (farbe.getRed()*256 + farbe.getBlue())*256 + farbe.getGreen();
	}

}
