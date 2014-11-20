package de.oose.io.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.numbers = 101;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("files/employee.ser");
         ObjectOutputStream out =
                            new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
          fileOut.close();
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
 
