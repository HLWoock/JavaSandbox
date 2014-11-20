package de.oose.generics.Tiere;

import java.util.ArrayList;
import java.util.List;


public class Zoo<T> {
	List<Tier>    tiere     = new ArrayList<Tier>();
	List<Elefant> elefanten = new ArrayList<Elefant>();
	List<Fisch>   fische    = new ArrayList<Fisch>();
	List<Floh>    flöhe     = new ArrayList<Floh>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		// erzeugen
		zoo.elefantenErzeugen();
		zoo.fischeErzeugen();
		zoo.flöheErzeugen();
		zoo.zooErzeugen();

		//tiere = elefanten; 
		//zoo.fütterung(zoo.elefanten);
		zoo.tiereSatt();
		zoo.fütterung2(zoo.elefanten);
		System.out.println();
		zoo.tiereSatt();
		
		zoo.tiereHinzufügen(zoo.flöhe);
		
	}
	
	private void tiereHinzufügen(List<T> neuzugänge){
		
	}
	
	private void tiereSatt(){
		System.out.println("Tiere satt?");
		for (Tier tier : tiere) {
			System.out.println(tier.name + " ist satt: \t" + tier.satt);
		}
	}
	
	@SuppressWarnings("unused")
	private void fütterung(List<Tier> tiere){
		for (Tier tier : tiere) {
			tier.fressen();
		}
	}
	
	private void fütterung2(List<? extends Tier> tiere){
		//tiere.add(new Elefant("Dumbo", Geschlecht.M));
		for (Tier tier : tiere) {
			tier.fressen();
		}
	}
	
	private void zooErzeugen() {
		for (Elefant elefant : elefanten) {
			tiere.add(elefant);
		}
		for (Fisch fisch : fische) {
			tiere.add(fisch);
		}
	}

	private void fischeErzeugen() {
		fische.add(new Fisch("Qualle", false));
		fische.add(new Fisch("Nepomuk", false));
		fische.add(new Fisch("Goliath", false));
	}

	private void elefantenErzeugen() {
		elefanten.add(new Elefant("Dumbo", Geschlecht.M));
		elefanten.add(new Elefant("Leisa", Geschlecht.W));
		elefanten.add(new Elefant("Clara", Geschlecht.W));
	}
	
	private void flöheErzeugen(){
		
	}

}
