package de.oose.webservice.soap;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.oose.webservice.soap.service.stockrate.StockQuoteLocator;
import de.oose.webservice.soap.service.stockrate.StockQuoteSoap;

public class MyStockRate {
	public static void main(String[] args) throws ServiceException, RemoteException {
		StockQuoteLocator service = new StockQuoteLocator();
		StockQuoteSoap stockQuoteSoap = service.getStockQuoteSoap();
		String quote = stockQuoteSoap.getQuote("ADS");
		
		System.out.println(quote);
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder        db  = dbf.newDocumentBuilder();
			Document               doc = db.parse(new ByteArrayInputStream(quote.getBytes()));
			

			doc.getDocumentElement().normalize();
			NodeList allStocks = doc.getElementsByTagName("Stock");
			
			Element stockNode = (Element) allStocks.item(0);
			String letzterKurs = getNodeValue(stockNode, "Last");
			String name        = getNodeValue(stockNode, "Name");
			String symbol      = getNodeValue(stockNode, "Symbol");
			System.out.println(name + "[" + symbol + "]:" + letzterKurs);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String getNodeValue(Element stockNode, String nodeName) {
		NodeList firstElementList = stockNode.getElementsByTagName(nodeName);
		Element  firstElement     = (Element) firstElementList.item(0);
		NodeList elementValue     = firstElement.getChildNodes();
		
		return elementValue.item(0).getNodeValue();
	}
}
