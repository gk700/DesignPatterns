package com.design.serviceLocaterPattern;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocater {
	private static Map<String, BookingService> services = new HashMap<>();
	
	// Registers a service with the locator
	public static void registerService(String serviceName, BookingService serviceType) {
		services.put(serviceName, serviceType);
		
	}
	
	// Retrieves a service from the locator
	public static BookingService getService(String serviceName) {
		BookingService service = services.get(serviceName);
		if(service == null) {
			throw new IllegalArgumentException("Service not found :"+serviceName);
		}
		return service;
	}

}
