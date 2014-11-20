package de.oose.xml.stockRate;

import java.util.List;

public class StockRatesReadApp {
	public static void main(String[] args) {
		StaXParser read = new StaXParser();
		List<StockRate> readConfig = read
				.readConfig("src/de/oose/xml/files/StockRates.xml");
		for (StockRate stockRate : readConfig) {
			System.out.println(stockRate);
		}
	}
}
