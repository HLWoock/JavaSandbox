package de.oose.generics.Tiere;

import java.util.Date;


public class Fisch extends Tier {
	Boolean s��wasser;

	public Fisch(String name, Boolean s��wasser) {
		super();
		this.s��wasser = s��wasser;
		super.name   = name;
		aufgenommen  = new Date();
	}
}
