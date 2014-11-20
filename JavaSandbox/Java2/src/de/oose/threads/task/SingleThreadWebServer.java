package de.oose.threads.task;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleThreadWebServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(80);
		while(true) {
			Socket connection = socket.accept();
			handleRequest(connection);
		}

	}

	private static void handleRequest(Socket connection) {
		// TODO Auto-generated method stub
		
	}

}
