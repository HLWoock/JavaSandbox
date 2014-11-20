package de.oose.inner.fabrik;

import de.oose.inner.fabrik.SchwartauerWerke.Marmelade;


public class ErzeugeMarmelade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SchwartauerWerke werke = new SchwartauerWerke();
		Marmelade marmelade = werke.produziereMarmelade("Pflaume");
		System.out.println(marmelade);

	}

}
