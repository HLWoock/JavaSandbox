package de.oose.basics;

public class C {

	public static void main(String[] args) {
		A a = new A(); System.out.println(a.s);
		B b = new B(); System.out.println(b.s);
		A c = new B(); System.out.println(c.s);
		A d = new B(); System.out.println(((B)d).s);
	}

}
