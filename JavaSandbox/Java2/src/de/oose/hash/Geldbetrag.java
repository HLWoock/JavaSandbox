package de.oose.hash;

public class Geldbetrag implements Comparable<Geldbetrag>{
	int betrag;
	String währung;

	@Override
	public String toString() {
		return "Geldbetrag [betrag=" + betrag + ", währung=" + währung + "]";
	}

	public Geldbetrag(int betrag, String währung) {
		super();
		this.betrag = betrag;
		this.währung = währung;
	}

	@Override
	public boolean equals(Object obj) {
//		return währung.equals(((Geldbetrag) obj).währung);
//		return betrag == ((Geldbetrag) obj).betrag 
//		    && währung.equals(((Geldbetrag) obj).währung);
		return betrag == ((Geldbetrag) obj).betrag;
	}

	@Override
	public int hashCode() {
//		return betrag + währung.length()*31;
		return betrag;
	}

	@Override
	public int compareTo(Geldbetrag o) {
		return betrag - o.betrag;
	}
}
