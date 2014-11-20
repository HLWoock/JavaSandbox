package de.oose.serviceloader;

public class Service2 implements Service {

	@Override
	public String sayHallo() {
		System.out.println("Service1 calling...");
		return "Service1";
	}

}
