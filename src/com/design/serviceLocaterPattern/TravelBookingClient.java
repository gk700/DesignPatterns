package com.design.serviceLocaterPattern;

public class TravelBookingClient {
	public static void main(String args[]) {
		
		// Register services
		ServiceLocater.registerService("Car", new CarBooking());
		ServiceLocater.registerService("Flight", new FlightBooking());
		ServiceLocater.registerService("Hotel", new HotelBooking());
		
		// Use services via the Service Locator
		BookingService flightService = ServiceLocater.getService("Flight");
		flightService.book();
		
		BookingService carService = ServiceLocater.getService("Car");
		carService.book();
		
		BookingService hotelService = ServiceLocater.getService("Hotel");
		hotelService.book();
		
	}

}
