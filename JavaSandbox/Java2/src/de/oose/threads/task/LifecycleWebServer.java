package de.oose.threads.task;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class LifecycleWebServer {
    private static final int NTHREADS = 100;
    private static final ExecutorService exec = Executors.newFixedThreadPool(NTHREADS);
	
	public void start() throws IOException {
		ServerSocket socket = new ServerSocket(80);
		while (!exec.isShutdown()) {
			try {
				final Socket conn = socket.accept();
				exec.execute(new Runnable() {
					
					@Override
					public void run() {
						handleRequest(conn);
					}

				});
			} catch (RejectedExecutionException e) {
				if(!exec.isShutdown())
					System.out.println("task submission rejectid");
			}
		}
	}
	
	private void handleRequest(Socket conn) {
		boolean isShutdownRequest = true;
		if (isShutdownRequest){
			stop();
		} else {
			System.out.println("weiter");
		}
	}

	private void stop() {
		exec.shutdown();
	}

}
