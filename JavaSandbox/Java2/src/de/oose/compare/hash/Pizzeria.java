package de.oose.compare.hash;

import java.util.Date;

public class Pizzeria {
	public String  name;
	public Date    er�ffnung;
	public Integer pl�tze;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((er�ffnung == null) ? 0 : er�ffnung.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pl�tze == null) ? 0 : pl�tze.hashCode());
		
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		if (getClass() != obj.getClass()) return false;
		
		Pizzeria other = (Pizzeria) obj;
		
		if (er�ffnung == null) {
			if (other.er�ffnung != null)
				return false;
		} else if (!er�ffnung.equals(other.er�ffnung))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (pl�tze == null) {
			if (other.pl�tze != null)
				return false;
		} else if (!pl�tze.equals(other.pl�tze))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pizzeria [name=" + name 
		             + ", er�ffnung=" + er�ffnung
				     + ", pl�tze=" + pl�tze + "]";
	}
}
