package com.bridgeLabz.flightScheduling;

public class FlightSystem {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101, "New York", "London");
        Flight<String> flight2 = new Flight<>("AA202", "Los Angeles", "Tokyo");

        Booking<Integer> booking1 = new Booking<>(5001, flight1, "John Doe");
        Booking<String> booking2 = new Booking<>("B102", flight2, "Jane Smith");

        booking1.displayBookingInfo();
        System.out.println("----------------");
        booking2.displayBookingInfo();

        System.out.println("\n--- Flight Management ---");
        FlightManager<Integer> manager = new FlightManager<>();
        manager.addFlight(flight1);
        manager.displayAllFlights();
    }
}
//Booking ID: 5001
//Passenger: John Doe
//Flight: 101 | From: New York | To: London
//----------------
//Booking ID: B102
//Passenger: Jane Smith
//Flight: AA202 | From: Los Angeles | To: Tokyo
//
//--- Flight Management ---
//Flight: 101 | From: New York | To: London
