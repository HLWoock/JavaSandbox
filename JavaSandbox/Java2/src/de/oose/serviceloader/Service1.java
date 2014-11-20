package de.oose.serviceloader;

public class Service1 implements Service {

	@Override
	public String sayHallo() {
		System.out.println("Service1 calling...");
		return "Service1";
	}

}
