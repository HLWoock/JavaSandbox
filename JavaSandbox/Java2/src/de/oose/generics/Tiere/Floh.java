package de.oose.generics.Tiere;

import java.util.Date;

public class Floh extends Tier {
	Integer gr��e;

	public Floh(String name, Integer gr��e) {
		super();
		this.gr��e = gr��e;
		super.name   = name;
		aufgenommen  = new Date();
	}
}
