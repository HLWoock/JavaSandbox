package de.oose.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		MyClass class1 = new MyClass("Hermann", 183);
		FileOutputStream f_out = new FileOutputStream("myObject.data");
		ObjectOutputStream  o_out = new ObjectOutputStream(f_out);
		o_out.writeObject(class1);
		
		FileInputStream f_in = new FileInputStream("myObject.data");
		ObjectInputStream o_in = new ObjectInputStream(f_in);
		MyClass class2 = (MyClass) o_in.readObject();
		
		System.out.println(class2);

	}

}
