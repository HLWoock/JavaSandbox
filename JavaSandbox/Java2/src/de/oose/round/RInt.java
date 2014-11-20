package de.oose.round;

import static org.junit.Assert.*;

public class RInt {

	// round rounds mathematical round up to +Infinity at .5
	public static void main(String[] args) {
		assertEquals(-11.0, Math.round(-10.6), 0.0);
		assertEquals(-10.0, Math.round(-10.5), 0.0);  
		assertEquals(-10.0, Math.round(-10.4), 0.0);   

		assertEquals(11.0, Math.round(10.6), 0.0);
		assertEquals(11.0, Math.round(10.5), 0.0);  
		assertEquals(10.0, Math.round(10.4), 0.0); 
	}
}
