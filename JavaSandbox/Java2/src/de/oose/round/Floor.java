package de.oose.round;

import static org.junit.Assert.*;

public class Floor {

	// floor rounds to -Infinity
	public static void main(String[] args) {
		assertEquals(-11.0, Math.floor(-10.6), 0.0);
		assertEquals(-11.0, Math.floor(-10.5), 0.0);  
		assertEquals(-11.0, Math.floor(-10.4), 0.0);   

		assertEquals(10.0, Math.floor(10.4), 0.0);   
		assertEquals(10.0, Math.floor(10.5), 0.0);  
		assertEquals(10.0, Math.floor(10.6), 0.0);
	}
}
