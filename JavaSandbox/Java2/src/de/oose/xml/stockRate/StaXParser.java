package de.oose.xml.stockRate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaXParser {

	static final String STOCKRATE = "StockRate";
	static final String NAME = "Name";
	static final String LAST = "Last";
	static final String CLOSE = "Close";
	static final String HIGH = "High";
	static final String LOW = "Low";

	@SuppressWarnings("unchecked")
	public List<StockRate> readConfig(String configFile) {
		List<StockRate> stockRates = new ArrayList<StockRate>();
		try {
			// First create a new XMLInputFactory
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			// Setup a new eventReader
			InputStream in = new FileInputStream(configFile);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			// Read the XML document
			StockRate stockRate = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					// If we have a item element we create a new item
					if (startElement.getName().getLocalPart() == (STOCKRATE)) {
						stockRate = new StockRate();
						// We read the attributes from this tag and add the date
						// attribute to our object
						Iterator<Attribute> attributes = startElement.getAttributes();
						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();
							if (attribute.getName().toString().equals(NAME)) {
								stockRate.setName(attribute.getValue());
							}

						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart().equals(LAST)) {
							event = eventReader.nextEvent();
							stockRate.setLast(event.asCharacters().getData());
							continue;
						}
					}
					if (event.asStartElement().getName().getLocalPart().equals(CLOSE)) {
						event = eventReader.nextEvent();
						stockRate.setClose(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart().equals(HIGH)) {
						event = eventReader.nextEvent();
						stockRate.setHigh(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart().equals(LOW)) {
						event = eventReader.nextEvent();
						stockRate.setLow(event.asCharacters().getData());
						continue;
					}
				}
				// If we reach the end of an item element we add it to the list
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart() == (STOCKRATE)) {
						stockRates.add(stockRate);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		return stockRates;
	}

}
