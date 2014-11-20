package de.oose.inner.fabrik;

public class SchwartauerWerke {
	
	public class Marmelade {
		private String sorte;
		private Integer gewicht;
		private Marmelade(String sorte){
			this.sorte = sorte;
			gewicht = 250;
		}@Override
		public String toString() {
			return sorte + "n Marmelade";
		}
	}
	
	public Marmelade produziereMarmelade(String sorte){
		return new Marmelade(sorte);
	}

}
