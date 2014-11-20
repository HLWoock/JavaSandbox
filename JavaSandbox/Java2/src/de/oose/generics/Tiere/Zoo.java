package de.oose.generics.Tiere;

import java.util.ArrayList;
import java.util.List;


public class Zoo<T> {
	List<Tier>    tiere     = new ArrayList<Tier>();
	List<Elefant> elefanten = new ArrayList<Elefant>();
	List<Fisch>   fische    = new ArrayList<Fisch>();
	List<Floh>    fl�he     = new ArrayList<Floh>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		// erzeugen
		zoo.elefantenErzeugen();
		zoo.fischeErzeugen();
		zoo.fl�heErzeugen();
		zoo.zooErzeugen();

		//tiere = elefanten; 
		//zoo.f�tterung(zoo.elefanten);
		zoo.tiereSatt();
		zoo.f�tterung2(zoo.elefanten);
		System.out.println();
		zoo.tiereSatt();
		
		zoo.tiereHinzuf�gen(zoo.fl�he);
		
	}
	
	private void tiereHinzuf�gen(List<T> neuzug�nge){
		
	}
	
	private void tiereSatt(){
		System.out.println("Tiere satt?");
		for (Tier tier : tiere) {
			System.out.println(tier.name + " ist satt: \t" + tier.satt);
		}
	}
	
	@SuppressWarnings("unused")
	private void f�tterung(List<Tier> tiere){
		for (Tier tier : tiere) {
			tier.fressen();
		}
	}
	
	private void f�tterung2(List<? extends Tier> tiere){
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
	
	private void fl�heErzeugen(){
		
	}

}
