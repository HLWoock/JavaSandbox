package de.oose.generics.Tiere;

import java.util.Date;

public class Floh extends Tier {
	Integer größe;

	public Floh(String name, Integer größe) {
		super();
		this.größe = größe;
		super.name   = name;
		aufgenommen  = new Date();
	}
}
