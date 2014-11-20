package de.oose.format;

import static java.lang.System.*;

public class Printf {

//	%n  Neue Zeile  
//	%b  Boolean  
//	%%  Prozentzeichen  
//	%s  String  
//	%c  Unicode-Zeichen  
//	%d  Dezimalzahl  
//	%x  Hexadezimalschreibweise  
//	%t  Datum und Zeit  
//	%f  Flieﬂkommazahl  
//	%e  Wissenschaftliche Notation  

	public static void main(String[] args) {
		out.println(String.format("Hallo %s, wie geht's?", "Hermann"));
		
		String[] arg = { "Ulli", "Tanja" };
		out.printf( "Hallo %s. Es gab ein Anruf von %s.", arg );
		
	    int i = 123;
	    out.printf( "|%d|   |%d|\n" ,     i, -i);       // |123|   |-123|
	    out.printf( "|%5d| |%5d|\n" ,     i, -i);       // |  123| | ñ123|
	    out.printf( "|%-5d| |%-5d|\n" ,   i, -i);       // |123  | |-123 |
	    out.printf( "|%+-5d| |%+-5d|\n" , i, -i);       // |+123 | |-123 |
	    out.printf( "|%05d| |%05d|\n\n",  i, -i);       // |00123| |-0123|
	    out.printf( "|%X| |%x|\n", 0xabc, 0xabc );      // |ABC| |abc|
	    out.printf( "|%08x| |%#x|\n\n", 0xabc, 0xabc ); // |00000abc| |0xabc|
	    
	    double d = 1234.5678;
	    out.printf( "|%f| |%f|\n" ,         d, -d);  // |1234,567800| |-1234,567800|
	    out.printf( "|%.2f| |%.2f|\n" ,     d, -d);  // |1234,57| |-1234,57|
	    out.printf( "|%10f| |%10f|\n" ,     d, -d);  // |1234,567800| |-1234,567800|
	    out.printf( "|%10.2f| |%10.2f|\n" , d, -d);  // |   1234,57| |  ñ1234,57|
	    out.printf( "|%010.2f| |%010.2f|\n",d, -d);  // |0001234,57| |-001234,57|
	    
		String s = "Rechnung";
	    out.printf( "\n|%s|\n", s );                 // |Rechnung|
	    out.printf( "|%20s|\n", s );                 // |        Rechnung|
	    out.printf( "|%-20s|\n", s );                // |Rechnung        |
	    out.printf( "|%7s|\n", s );                  // |Rechnung|
	    out.printf( "|%.5s|\n", s );                 // |Rechn|
	    out.printf( "|%20.5s|\n", s );               // |           Rechn|


	}

}
