package de.oose.inner.auto;

public class Auto {
	private String geschwindigkeit = "0 km/h";
	
	public class Gaspedal {
		public void gibGas(){
			Auto.this.fahre();
			System.out.println(geschwindigkeit);
		}
	}
	public void fahre(){
		System.out.println(geschwindigkeit);
	}
	
	public Gaspedal nutzeGaspedal(){
		Gaspedal gasPedal = new Gaspedal();
		return gasPedal;
	}
}
