package de.oose.tdd;

public class Fehlersensibilität {

	public static void main(String[] args) {
		int count = 1;
		for (short i=Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
			int a = scaleRight(i);
			int b = scaleWrong(i);
			if (a!=b){
			System.out.println(String.format("%d. %d liefert %d statt %d", count++, i, a, b));
			}
		}
	}

	private static int scaleWrong(short wert) {
		wert -= 1;
		wert /= 3000;
		return wert;
	}

	private static int scaleRight(short wert) {
		wert += 1;
		wert /= 3000;
		return wert;
	}


}
