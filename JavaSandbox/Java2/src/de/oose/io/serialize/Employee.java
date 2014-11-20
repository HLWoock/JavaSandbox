package de.oose.io.serialize;

public class Employee implements java.io.Serializable 
{
	private static final long serialVersionUID = -49400081216951810L;
	public String name;
	public String address;
	public int SSN;
	public int numbers;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}
