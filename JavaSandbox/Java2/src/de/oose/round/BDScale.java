package de.oose.round;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BDScale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double value    = 10.5;
		double value_   = 2.0;
		BigDecimal v1   = new BigDecimal(Double.toString(value)); 
		BigDecimal v2   = new BigDecimal(Double.toString(value_));
		double expected = 2.5;
		double delta    = 2.5;
		int    scale    = 2;

		
		assertEquals(10.0, (v1.setScale(2, BigDecimal.ROUND_HALF_UP)).toString());
		assertEquals(10.0, (v1.setScale(2, RoundingMode.HALF_UP)).toString());
	}
	
	 public static double round(double number, int scale, RoundingMode method) {
	    	BigDecimal bd = new BigDecimal(Double.toString(number)); 
	    	MathContext mathContext = new MathContext(scale);
	    	bd = bd.round(mathContext);
	    	double result = bd.doubleValue();
	    	System.out.println(result);
	    	return result;
	    }

}
