package de.oose.generics.Tiere;

import java.util.Date;


public class Fisch extends Tier {
	Boolean süßwasser;

	public Fisch(String name, Boolean süßwasser) {
		super();
		this.süßwasser = süßwasser;
		super.name   = name;
		aufgenommen  = new Date();
	}
}
