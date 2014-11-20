/**
 * 
 */
package de.oose.autoboxing;

/**
 * @author Hermann
 *
 */
public class IntegerCache {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Integer bis 127 sind in der Funktion valueOf gecached.
		for (int i = 0; i < 130; i++){
			Object obj1 = i;
			Object obj2 = i;
			if (obj1 != obj2) {
				System.out.println(i);
			}
		}
	}

}
