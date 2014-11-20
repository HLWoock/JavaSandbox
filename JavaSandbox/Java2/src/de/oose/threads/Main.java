package de.oose.threads;

import org.codehaus.groovy.tools.shell.util.Logger;

import de.oose.threads.count.*;

public class Main {

	Logger log = Logger.create(Main.class);
	
	public static void main(String[] args) {
		Main theApp = new Main();
//		theApp.runUnsync(new NormCount());
//		theApp.runUnsync(new SyncCount());
		theApp.runUnsync(new AtomCount());

	}

	private void runUnsync(final Count c) {
		System.out.println("und los...");
		new Thread(){
			@Override
			public void run() {
				for (int i =0; i < 50; i++)
					System.out.println("a: " + c.next());
			}
		}.start();
		
		new Thread(){
			@Override
			public void run() {
				for (int i =0; i < 50; i++)
					System.out.println("b: " + c.next());
			}
		}.start();
	}
}
