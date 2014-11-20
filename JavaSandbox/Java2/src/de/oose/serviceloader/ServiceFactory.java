package de.oose.serviceloader;

import java.util.ServiceLoader;

public class ServiceFactory {
	private static ServiceLoader<Service> myServices = ServiceLoader.load(Service.class);

	public static void main(String[] args) {
		for (Service service : myServices) {
			service.sayHallo();
		}
	}
}
