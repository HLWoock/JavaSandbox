package de.oose.compare.hash;

import java.util.Date;

public class Pizzeria {
	public String  name;
	public Date    eröffnung;
	public Integer plätze;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((eröffnung == null) ? 0 : eröffnung.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((plätze == null) ? 0 : plätze.hashCode());
		
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		if (getClass() != obj.getClass()) return false;
		
		Pizzeria other = (Pizzeria) obj;
		
		if (eröffnung == null) {
			if (other.eröffnung != null)
				return false;
		} else if (!eröffnung.equals(other.eröffnung))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (plätze == null) {
			if (other.plätze != null)
				return false;
		} else if (!plätze.equals(other.plätze))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pizzeria [name=" + name 
		             + ", eröffnung=" + eröffnung
				     + ", plätze=" + plätze + "]";
	}
}
