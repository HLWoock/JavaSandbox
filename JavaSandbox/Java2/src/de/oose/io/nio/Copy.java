package de.oose.io.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.channels.FileChannel;

public class Copy {

	public static void main(String[] args) throws Exception {
		Copy copy = new Copy();
		long start = System.currentTimeMillis();
		copy.nioCopy();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		start = System.currentTimeMillis();
		copy.javaCopy();
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	public void nioCopy(){
		try {
		    // Create channel on the source
		    FileChannel srcChannel = new FileInputStream("src/de/oose/io/nio/CopyOfCopy.java").getChannel();

		    // Create channel on the destination
		    FileChannel dstChannel = new FileOutputStream("files/NioCopy.txt").getChannel();

		    // Copy file contents from source to destination
		    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());

		    // Close the channels
		    srcChannel.close();
		    dstChannel.close();
		} catch (IOException e) {
		}
	}
	
	public void javaCopy() throws Exception{
		FileInputStream  reader = new FileInputStream("src/de/oose/io/nio/Copy.java");
		FileOutputStream writer = new FileOutputStream("files/JavaCopy.txt");
		
		int zeichen = 0;
		
		while ((zeichen = reader.read()) != -1){
			writer.write(zeichen);
		}
		
		reader.close();
		writer.close();
	}
}
