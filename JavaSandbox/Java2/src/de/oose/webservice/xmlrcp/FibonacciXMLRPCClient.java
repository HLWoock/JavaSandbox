package de.oose.webservice.xmlrcp;

import java.net.*;
import java.io.*;


public class FibonacciXMLRPCClient {
  
  private static String defaultServer 
   = "http://www.elharo.com/fibonacci/XML-RPC";
   
  public static void main(String[] args) {

    String index = "10";
    
    String server = defaultServer;
    
    try {
      URL u = new URL(server);
      URLConnection uc = u.openConnection();
      HttpURLConnection connection = (HttpURLConnection) uc;
      connection.setDoOutput(true);
      connection.setDoInput(true); 
      connection.setRequestMethod("POST");
      OutputStream out = connection.getOutputStream();
      OutputStreamWriter wout = new OutputStreamWriter(out, "UTF-8");
      
      wout.write("<?xml version=\"1.0\"?>");  
      wout.write("<methodCall>"); 
      wout.write("  <methodName>calculateFibonacci</methodName>");
      wout.write("  <params>"); 
      wout.write("    <param>"); 
      wout.write("      <value><int>"); 
      wout.write(index); 
      wout.write("</int></value>"); 
      wout.write("    </param>"); 
      wout.write("  </params>"); 
      wout.write("</methodCall>"); 
      
      wout.flush();
      out.close();
      
      InputStream in = connection.getInputStream();
      int c;
      while ((c = in.read()) != -1) System.out.write(c);
      System.out.println();
      in.close();
      out.close();
      connection.disconnect();
    }
    catch (IOException e) {
      System.err.println(e); 
      e.printStackTrace();
    }
  } 
}

