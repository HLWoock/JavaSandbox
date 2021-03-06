package de.oose.socket;

import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {

        final String   host       = "localhost";
        final int      port       = 7;
    	Socket         echoSocket = null;
        PrintWriter    out        = null;
        BufferedReader in         = null;

        // open
        try {
            echoSocket = new Socket        (host, port);
            out        = new PrintWriter   (echoSocket.getOutputStream(), true);
            in         = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: " + host + ".");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: " + host + ".");
            System.exit(1);
        }

        
        // read user data
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
	
		while ((userInput = stdIn.readLine()) != null) {
		    out.println(userInput);
		    System.out.println("echo: " + in.readLine());
		}
	
		// close all
		out.close();
		in.close();
		stdIn.close();
		echoSocket.close();
    }
}
