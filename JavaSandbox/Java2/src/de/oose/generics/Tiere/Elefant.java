package de.oose.generics.Tiere;

import java.util.Date;


public class Elefant extends Tier {
	Geschlecht geschlecht;

	public Elefant(String name, Geschlecht geschlecht) {
		super();
		this.geschlecht = geschlecht;
		super.name   = name;
		aufgenommen  = new Date();
	}
}
