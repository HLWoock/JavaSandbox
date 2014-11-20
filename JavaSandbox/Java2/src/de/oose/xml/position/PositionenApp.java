package de.oose.xml.position;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class PositionenApp {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder domBuilder = domFactory.newDocumentBuilder();

		Document newDoc = domBuilder.newDocument();
		Element rootElement = newDoc.createElement("CSV2XML");
		newDoc.appendChild(rootElement);

		BufferedReader csvReader = new BufferedReader(new FileReader("src/de/oose/xml/files/PositionenXML.csv"));
		String   curLine    = csvReader.readLine();
		String[] csvFields  = curLine.split(":");
		Element  rowElement = newDoc.createElement("row");
		for (String value : csvFields) {
			Element curElement = newDoc.createElement(value);
			curElement.appendChild(newDoc.createTextNode(value));
			rowElement.appendChild(curElement);
			rootElement.appendChild(rowElement);
		}
		csvReader.close();
		TransformerFactory tranFactory = TransformerFactory.newInstance();
		Transformer aTransformer = tranFactory.newTransformer();
		Source src = new DOMSource(newDoc);
		File file = new File("src/de/oose/xml/files/PositionenXML1.xml");
		Result dest = new StreamResult(file);
		aTransformer.transform(src, dest);
	}
}