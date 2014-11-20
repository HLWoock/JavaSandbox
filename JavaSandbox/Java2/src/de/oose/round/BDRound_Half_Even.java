package de.oose.round;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BDRound_Half_Even {

	// Rounding mode to round towards the "nearest neighbor" 
	// unless both neighbors are equidistant, in which case, round towards the even neighbor. 
	// Behaves as for RoundingMode.HALF_UP if the digit to the left of the discarded fraction is odd; 
	// behaves as for RoundingMode.HALF_DOWN if it's even. 
	// Note that this is the rounding mode that statistically minimizes cumulative error 
	// when applied repeatedly over a sequence of calculations. 
	// It is sometimes known as "Banker's rounding," and is chiefly used in the USA. 
	// This rounding mode is analogous to the rounding policy used for float and double arithmetic in Java. 
	public static void main(String[] args) {
		double delta    = 0;
		int    scale    = 1;
		assertEquals(-10.0, BDRound_Half_Even.round(-10.6, scale, RoundingMode.HALF_EVEN), delta);
		assertEquals(-10.0, BDRound_Half_Even.round(-10.5, scale, RoundingMode.HALF_EVEN), delta);
		assertEquals(-10.0, BDRound_Half_Even.round(-10.4, scale, RoundingMode.HALF_EVEN), delta);
		
		assertEquals(10.0, BDRound_Half_Even.round(10.4, scale, RoundingMode.HALF_EVEN), delta);
		assertEquals(10.0, BDRound_Half_Even.round(10.5, scale, RoundingMode.HALF_EVEN), delta);
		assertEquals(10.0, BDRound_Half_Even.round(10.6, scale, RoundingMode.HALF_EVEN), delta);
	}
	
	 public static double round(double number, int scale, RoundingMode method) {
	    	BigDecimal bd = new BigDecimal(number); 
	    	bd = bd.round(new MathContext(scale));
	    	return bd.doubleValue();
	    }

}
