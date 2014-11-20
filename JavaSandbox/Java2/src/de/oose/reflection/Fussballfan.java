package de.oose.reflection;

import java.util.Date;

@Biertrinker(biersorte="Astra")
public class Fussballfan implements Cloneable{
	String verein;
	Date   beitritt;
	
	
	public void schlachtruf(){
		System.out.println(verein + " vor noch ein Tor!");
	}
	
	private void geheimnis(){
		System.out.println("Einmal Deutscher Meister");
	}
}
