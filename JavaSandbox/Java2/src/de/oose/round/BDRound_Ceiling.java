package de.oose.round;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BDRound_Ceiling {

	// Rounding mode to round towards positive infinity. 
	// If the result is positive, behaves as for RoundingMode.UP; 
	// if negative, behaves as for RoundingMode.DOWN. 
	// Note that this rounding mode never decreases the calculated value.
	public static void main(String[] args) {
		double delta    = 0;
		int    scale    = 1;
		assertEquals(-10.0, BDRound_Ceiling.round(-10.6, scale, RoundingMode.CEILING), delta);
		assertEquals(-10.0, BDRound_Ceiling.round(-10.5, scale, RoundingMode.CEILING), delta);
		assertEquals(-10.0, BDRound_Ceiling.round(-10.4, scale, RoundingMode.CEILING), delta);
		
		assertEquals(10.0, BDRound_Ceiling.round(10.4, scale, RoundingMode.CEILING), delta);
		assertEquals(10.0, BDRound_Ceiling.round(10.5, scale, RoundingMode.CEILING), delta);
		assertEquals(10.0, BDRound_Ceiling.round(10.6, scale, RoundingMode.CEILING), delta);
	}
	
	 public static double round(double number, int scale, RoundingMode method) {
	    	BigDecimal bd = new BigDecimal(number); 
	    	bd = bd.round(new MathContext(scale));
	    	return bd.doubleValue();
	    }

}
