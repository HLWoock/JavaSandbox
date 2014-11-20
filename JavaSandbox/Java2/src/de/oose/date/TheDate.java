package de.oose.date;

import java.util.Calendar;
import java.util.Date;

public class TheDate {
	public static void main(String[] args) {
		Date date = new Date(111,6-1,7);
		System.out.println(date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2011, 6-1, 7);
		System.out.println(calendar.getTime());
		
		calendar.add(Calendar.DATE, 100);
		System.out.println(calendar.getTime());
		
		
		calendar.setTime(new Date());
	}
}
