package de.oose.inner.auto;

import de.oose.inner.auto.Auto.Gaspedal;


public class Fahre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.fahre();
		
		System.out.println();
		Gaspedal gaspedal = auto.nutzeGaspedal();
		gaspedal.gibGas();
		
		System.out.println();
	    Gaspedal inner = auto.new Gaspedal();
	    
	    inner.gibGas();
		
		
		

	}

}
