package de.oose.xml.stockRate;

import java.io.FileOutputStream;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaXWriter {
  private String stockRatesFile;

  public void setFile(String stockRatesFile) {
    this.stockRatesFile = stockRatesFile;
  }

  public void saveStockRates() throws Exception {
    // Create a XMLOutputFactory
    XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
    // Create XMLEventWriter
    XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(stockRatesFile));
    // Create a EventFactory
    XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    XMLEvent end = eventFactory.createDTD("\n");
    // Create and write Start Tag
    StartDocument startDocument = eventFactory.createStartDocument();
    eventWriter.add(startDocument);
    eventWriter.add(end);
    
    // Create config open tag
    StartElement configStartElement = eventFactory.createStartElement("", "", "StockRates");
    eventWriter.add(configStartElement);
    eventWriter.add(end);
    
    // Write the different nodes
    createNode(eventWriter, "Last", "20");
    createNode(eventWriter, "Close", "21");
    createNode(eventWriter, "High", "23");
    createNode(eventWriter, "Low", "8");

    eventWriter.add(eventFactory.createEndElement("", "", "StockRates"));
    eventWriter.add(end);
    eventWriter.add(eventFactory.createEndDocument());
    eventWriter.close();
  }

  private void createNode(XMLEventWriter eventWriter, String name, String value) 
  	throws XMLStreamException {

    XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    XMLEvent end = eventFactory.createDTD("\n");
    XMLEvent tab = eventFactory.createDTD("\t");
    // Create Start node
    StartElement sElement = eventFactory.createStartElement("", "", name);
    eventWriter.add(tab);
    eventWriter.add(sElement);
    // Create Content
    Characters characters = eventFactory.createCharacters(value);
    eventWriter.add(characters);
    // Create End node
    EndElement eElement = eventFactory.createEndElement("", "", name);
    eventWriter.add(eElement);
    eventWriter.add(end);

  }

} 