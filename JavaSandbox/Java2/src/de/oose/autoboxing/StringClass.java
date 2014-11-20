/**
 * 
 */
package de.oose.autoboxing;

/**
 * @author Hermann
 *
 */
public class StringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// gleiche Strings werden gecached.
		String str1 = "abcd";
		String str2 = "abcd";
		System.out.println("str1 == str2     : " + (str1 == str2));
		System.out.println("str1.equals(str2): " + str1.equals(str2));

	}

}
