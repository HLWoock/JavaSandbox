package de.oose.generics.Tiere;

import java.util.Date;

public abstract class Tier {
	public String name;
	public Date   aufgenommen;
	public Boolean satt = false;
	
	public void fressen(){
		satt = true;
	};
}
