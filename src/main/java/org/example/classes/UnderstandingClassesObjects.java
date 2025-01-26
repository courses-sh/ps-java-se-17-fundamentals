package org.example.classes;

public class UnderstandingClassesObjects {
    public static void declaringClasses() {
        Flight flight = new Flight();

        System.out.println("New Flight - seats: " + flight.getSeats() + ", passengers: " + flight.passengers);

        while (flight.passengers < 10) {
            flight.addPassenger();
        }

        flight.setSeats(200);
        System.out.println("Updated Flight - seats: " + flight.getSeats() + ", passengers: " + flight.passengers);
        System.out.println();
    }
}
