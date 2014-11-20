package de.oose.round;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BDRound_Half_Down {

	// Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, 
	// in which case round down. Behaves as for RoundingMode.UP if the discarded fraction is > 0.5; 
	// otherwise, behaves as for RoundingMode.DOWN.
	public static void main(String[] args) {
		double delta    = 0;
		int    scale    = 1;
		assertEquals(-10.0, BDRound_Half_Down.round(-10.6, scale, RoundingMode.HALF_DOWN), delta);
		assertEquals(-10.0, BDRound_Half_Down.round(-10.5, scale, RoundingMode.HALF_DOWN), delta);
		assertEquals(-10.0, BDRound_Half_Down.round(-10.4, scale, RoundingMode.HALF_DOWN), delta);
		
		assertEquals(10.0, BDRound_Half_Down.round(10.4, scale, RoundingMode.HALF_DOWN), delta);
		assertEquals(10.0, BDRound_Half_Down.round(10.5, scale, RoundingMode.HALF_DOWN), delta);
		assertEquals(10.0, BDRound_Half_Down.round(10.6, scale, RoundingMode.HALF_DOWN), delta);
	}
	
	 public static double round(double number, int scale, RoundingMode method) {
	    	BigDecimal bd = new BigDecimal(number); 
	    	bd = bd.round(new MathContext(scale));
	    	return bd.doubleValue();
	    }

}
