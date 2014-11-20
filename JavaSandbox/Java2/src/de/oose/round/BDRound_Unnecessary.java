package de.oose.round;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BDRound_Unnecessary {

	// Rounding mode to assert that the requested operation has an exact result, 
	// hence no rounding is necessary. If this rounding mode is specified on an operation that yields an inexact result, an ArithmeticException is thrown. 


	public static void main(String[] args) {
		double delta    = 0;
		int    scale    = 1;
		assertEquals(-10.0, BDRound_Unnecessary.round(-10.6, scale, RoundingMode.UNNECESSARY), delta);
		assertEquals(-10.0, BDRound_Unnecessary.round(-10.5, scale, RoundingMode.UNNECESSARY), delta);
		assertEquals(-10.0, BDRound_Unnecessary.round(-10.4, scale, RoundingMode.UNNECESSARY), delta);
		
		assertEquals(10.0, BDRound_Unnecessary.round(10.4, scale, RoundingMode.UNNECESSARY), delta);
		assertEquals(10.0, BDRound_Unnecessary.round(10.5, scale, RoundingMode.UNNECESSARY), delta);
		assertEquals(10.0, BDRound_Unnecessary.round(10.6, scale, RoundingMode.UNNECESSARY), delta);
	}
	
	 public static double round(double number, int scale, RoundingMode method) {
	    	BigDecimal bd = new BigDecimal(number); 
	    	bd = bd.round(new MathContext(scale));
	    	return bd.doubleValue();
	    }

}
