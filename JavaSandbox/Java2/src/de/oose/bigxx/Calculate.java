package de.oose.bigxx;

import java.math.BigDecimal;

public class Calculate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		calculate();
		loop();
		round();
		
		init();
		
	}

	private static void calculate() {
		System.out.println(10 / 3);
		System.out.println(10 / 3.0);
		try {
		System.out.println(10 / 0);
		} catch (ArithmeticException ex) {
			ex.getStackTrace();
		}
		System.out.println(10 / 0.0);
		System.out.println(0 / 0.0);
	}
	
	private static void loop(){
		double d = 0.1;
		for(int i=0; i<10; i++){
			d += 0.1;
		}
		System.out.println(d);
	}

	private static void init() {
		// initialisieren
		System.out.println("\nInitialisierung");
		System.out.println(new BigDecimal(0.1).toString()); 
		System.out.println(new BigDecimal("0.1").toString());
	}

	private static void round() {
		// runden
		BigDecimal bd1 = BigDecimal.valueOf(1.0);
		BigDecimal bd2 = BigDecimal.valueOf(2.0);
		int scale = 0;
		System.out.println(bd1.divide(bd2,scale, BigDecimal.ROUND_DOWN));
		System.out.println(bd1.divide(bd2,scale, BigDecimal.ROUND_FLOOR));
		System.out.println(bd1.divide(bd2,scale, BigDecimal.ROUND_HALF_DOWN));
		System.out.println(bd1.divide(bd2,scale, BigDecimal.ROUND_HALF_EVEN));
		System.out.println(bd1.divide(bd2,scale, BigDecimal.ROUND_HALF_UP));
		System.out.println(bd1.divide(bd2,scale, BigDecimal.ROUND_UP));
		System.out.println(bd1.divide(bd2,scale, BigDecimal.ROUND_CEILING));
		try {
			System.out.println(bd1.divide(bd2, BigDecimal.ROUND_UNNECESSARY));
		} catch (ArithmeticException e) {
			System.out.println("Runden war nötig");
		}
	}

}
