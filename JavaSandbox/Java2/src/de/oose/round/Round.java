package de.oose.round;

import static org.junit.Assert.*;

public class Round {

	// rint rounds commercial like round with one exception
	public static void main(String[] args) {
		assertEquals(-11.0, Math.rint(-10.6), 0.0);
		assertEquals(-10.0, Math.rint(-10.5), 0.0);  
		assertEquals(-10.0, Math.rint(-10.4), 0.0);   

		assertEquals(10.0, Math.rint(10.4), 0.0); 
		assertEquals(10.0, Math.rint(10.5), 0.0);  // round goes to 11.0
		assertEquals(11.0, Math.rint(10.6), 0.0);
	}
}
