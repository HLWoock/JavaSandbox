package de.oose.serialize;

import java.io.Serializable;

public class MyClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public Integer groesse;
	
	
	public MyClass(String name, Integer groesse) {
		super();
		this.name = name;
		this.groesse = groesse;
	}

	
}
