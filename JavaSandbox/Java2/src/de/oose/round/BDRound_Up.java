package de.oose.round;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BDRound_Up {

	// Rounding mode to round away from zero. 
	// Always increments the digit prior to a non-zero discarded fraction. 
	// Note that this rounding mode never decreases the magnitude of the calculated value.
	public static void main(String[] args) {
		double delta    = 0;
		int    scale    = 1;
		assertEquals(-10.0, BDRound_Up.round(-10.6, scale, RoundingMode.UP), delta);
		assertEquals(-10.0, BDRound_Up.round(-10.5, scale, RoundingMode.UP), delta);
		assertEquals(-10.0, BDRound_Up.round(-10.4, scale, RoundingMode.UP), delta);
		
		assertEquals(10.0, BDRound_Up.round(10.4, scale, RoundingMode.UP), delta);
		assertEquals(10.0, BDRound_Up.round(10.5, scale, RoundingMode.UP), delta);
		assertEquals(10.0, BDRound_Up.round(10.6, scale, RoundingMode.UP), delta);
	}
	
	 public static double round(double number, int scale, RoundingMode method) {
	    	BigDecimal bd = new BigDecimal(number); 
	    	bd = bd.round(new MathContext(scale));
	    	return bd.doubleValue();
	    }

}
