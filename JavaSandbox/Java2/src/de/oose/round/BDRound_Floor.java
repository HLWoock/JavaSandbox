package de.oose.round;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BDRound_Floor {

	// Rounding mode to round towards negative infinity. 
	// If the result is positive, behave as for RoundingMode.DOWN; 
	// if negative, behave as for RoundingMode.UP. 
	// Note that this rounding mode never increases the calculated value.
	public static void main(String[] args) {
		double delta    = 0;
		int    scale    = 1;
		assertEquals(-11.0, BDRound_Floor.round(-10.6, scale, RoundingMode.FLOOR), delta);
		assertEquals(-11.0, BDRound_Floor.round(-10.5, scale, RoundingMode.FLOOR), delta);
		assertEquals(-10.0, BDRound_Floor.round(-10.4, scale, RoundingMode.FLOOR), delta);
		
		assertEquals(10.0, BDRound_Floor.round(10.4, scale, RoundingMode.FLOOR), delta);
		assertEquals(11.0, BDRound_Floor.round(10.5, scale, RoundingMode.FLOOR), delta);
		assertEquals(11.0, BDRound_Floor.round(10.6, scale, RoundingMode.FLOOR), delta);
	}
	
	 public static double round(double number, int scale, RoundingMode method) {
	    	BigDecimal bd = new BigDecimal(number); 
	    	bd = bd.round(new MathContext(scale));
	    	return bd.doubleValue();
	    }

}
