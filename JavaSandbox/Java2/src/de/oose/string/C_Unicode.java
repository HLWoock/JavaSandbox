package de.oose.string;

public class C_Unicode {

	public static byte[][] bytes = { { 0x42, 0x44, 0x46, 0x48, 0x4A },
			{ 0x4B, 0x4D, 0x4F, 0x51, 0x53 }, { 0x55, 0x57, 0x59, 0x5B, 0x5D } };

	public static void main(String[] args) throws Exception {
		System.err.println("Japanisches Alphabet");
		for (int i = 0; i < bytes.length; i++) {
			for (int k = 0; k < bytes[0].length; k++) {
				byte[] b = { 0x30, bytes[i][k] };
				String s = new String(b, "UTF-16");
				System.out.print(s);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("UNI-Code");
		System.out.println("Liebe = \u611b");
		System.out.println("Liebe = 愛");
		
		System.out.println();
		System.out.println("upper");
		String s = "gefäß";
		System.out.println(s.toUpperCase());
		
		System.out.println("\u00A4" + "\u2030");

	}

}
