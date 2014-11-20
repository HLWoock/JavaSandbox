package de.oose.string;

import static java.lang.System.out;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class G_Format {
	
	public static void main(String[] args) throws ParseException {
		out.println(DateFormat.getDateInstance().format(new Date()));
		out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
		out.println(DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()));
		out.println(DateFormat.getDateInstance(DateFormat.LONG).format(new Date()));
		
		out.println(DateFormat.getTimeInstance(DateFormat.SHORT).format(new Date()));
		out.println(DateFormat.getTimeInstance(DateFormat.MEDIUM).format(new Date()));
		out.println(DateFormat.getTimeInstance(DateFormat.LONG).format(new Date()));
		
		// Format Numbers
		out.println("\nGeldbeträge ausgeben");
		DecimalFormat format = new DecimalFormat("0.00");
		out.println(format.format(5.5) + format.getCurrency());
		format = new DecimalFormat("00.00¤");
		out.println(format.format(5.5));
		format = new DecimalFormat("0.0\u2030");
		out.println(format.format(.0055));

		// Format Dates
		DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.MEDIUM);
		out.println("\n" + dateInstance.format(new Date()));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH:mm:SS");
		Date heute = sdf.parse("06.06.11 10:15:12");
		out.println("heute ist: " + sdf.format(heute));
	}
}
