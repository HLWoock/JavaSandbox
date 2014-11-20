package de.oose.hash;

public class Geldbetrag implements Comparable<Geldbetrag>{
	int betrag;
	String w�hrung;

	@Override
	public String toString() {
		return "Geldbetrag [betrag=" + betrag + ", w�hrung=" + w�hrung + "]";
	}

	public Geldbetrag(int betrag, String w�hrung) {
		super();
		this.betrag = betrag;
		this.w�hrung = w�hrung;
	}

	@Override
	public boolean equals(Object obj) {
//		return w�hrung.equals(((Geldbetrag) obj).w�hrung);
//		return betrag == ((Geldbetrag) obj).betrag 
//		    && w�hrung.equals(((Geldbetrag) obj).w�hrung);
		return betrag == ((Geldbetrag) obj).betrag;
	}

	@Override
	public int hashCode() {
//		return betrag + w�hrung.length()*31;
		return betrag;
	}

	@Override
	public int compareTo(Geldbetrag o) {
		return betrag - o.betrag;
	}
}
