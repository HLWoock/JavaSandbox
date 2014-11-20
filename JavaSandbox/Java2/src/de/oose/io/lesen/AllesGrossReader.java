package de.oose.io.lesen;

import java.io.IOException;
import java.io.Reader;

public class AllesGrossReader extends Reader {
	
	Reader quelle;

	public AllesGrossReader(Reader quelle) {
		this.quelle = quelle;
	}

	public void close() throws IOException {
		quelle.close();
	}

	public int read(char[] cbuf, int off, int len) throws IOException {	
		int anzahlZeichen = quelle.read(cbuf, off, len);
		
		for (int i=off; i<len; i++) {
			cbuf[i] = Character.toUpperCase(cbuf[i]);
		}
		
		return anzahlZeichen;
	}
	
	

}
