package de.oose.enumeration;

public class Universum {
	private enum WeltraumObjekt {
	    MERCURY ,
	    VENUS   ,
	    EARTH   ,
	    MARS_   ,
	    JUPITER ,
	    SATURN  ,
	    URANUS  ,
	    NEPTUNE ;
	}
	public Universum() {
		// TODO Auto-generated constructor stub
	}
	
	public void Urknall(){
		for (WeltraumObjekt p : WeltraumObjekt.values())
	           System.out.printf("Erschaffe %s%n", p);
	}
	
	public static void main(String[] args) {
		Universum universum = new Universum();
		universum.Urknall();
	}
}
