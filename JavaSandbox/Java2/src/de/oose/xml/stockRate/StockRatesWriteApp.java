package de.oose.xml.stockRate;

import java.util.List;

public class StockRatesWriteApp {
	public static void main(String[] args) {
	    StaXWriter configFile = new StaXWriter();
	    configFile.setFile("src/de/oose/xml/files/OUTStockRates.xml");
	    try {
	      configFile.saveStockRates();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
}
