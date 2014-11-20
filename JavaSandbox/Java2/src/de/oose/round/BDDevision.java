package de.oose.round;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BDDevision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double value    = 21.0;
		double value_   = 2.0;
		BigDecimal v1   = new BigDecimal(Double.toString(value)); 
		BigDecimal v2   = new BigDecimal(Double.toString(value_));
		double expected = 2.5;
		double delta    = 2.5;
		int    scale    = 0;

		
		
		assertEquals(new BigDecimal("10"), v1.divide(v2,scale, BigDecimal.ROUND_DOWN));
		assertEquals(new BigDecimal("10"), v1.divide(v2,scale, BigDecimal.ROUND_FLOOR));
		assertEquals(new BigDecimal("10"), v1.divide(v2,scale, BigDecimal.ROUND_HALF_DOWN));
		assertEquals(new BigDecimal("10"), v1.divide(v2,scale, BigDecimal.ROUND_HALF_EVEN));
		assertEquals(new BigDecimal("11"), v1.divide(v2,scale, BigDecimal.ROUND_HALF_UP));
		assertEquals(new BigDecimal("11"), v1.divide(v2,scale, BigDecimal.ROUND_UP));
		assertEquals(new BigDecimal("11"), v1.divide(v2,scale, BigDecimal.ROUND_CEILING));
		
		v1 =  new BigDecimal(Double.toString(-value)); 
		assertEquals(new BigDecimal("-10"), v1.divide(v2,scale, BigDecimal.ROUND_DOWN));
		assertEquals(new BigDecimal("-11"), v1.divide(v2,scale, BigDecimal.ROUND_FLOOR));
		assertEquals(new BigDecimal("-10"), v1.divide(v2,scale, BigDecimal.ROUND_HALF_DOWN));
		assertEquals(new BigDecimal("-10"), v1.divide(v2,scale, BigDecimal.ROUND_HALF_EVEN));
		assertEquals(new BigDecimal("-11"), v1.divide(v2,scale, BigDecimal.ROUND_HALF_UP));
		assertEquals(new BigDecimal("-11"), v1.divide(v2,scale, BigDecimal.ROUND_UP));
		assertEquals(new BigDecimal("-10"), v1.divide(v2,scale, BigDecimal.ROUND_CEILING));

	}
}
