package de.oose.io.lesen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

import de.oose.props.Read;

public class Lies {

	public static void main(String[] args) throws IOException {

		Reader datei = new FileReader("src/de/oose/io/lesen/Lies.java");
		BufferedReader bufferedReader = new BufferedReader(datei);
		AllesGrossReader allesGrossReader = new AllesGrossReader(bufferedReader);
		LineNumberReader numberReader = new LineNumberReader(allesGrossReader);
		
		String i;
		while(!((i = numberReader.readLine())== null)){
			System.out.println(numberReader.getLineNumber() + i);
		}

	}

}
