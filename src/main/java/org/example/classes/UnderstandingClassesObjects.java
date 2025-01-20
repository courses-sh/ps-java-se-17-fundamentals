package org.example.classes;

public class UnderstandingClassesObjects {
    public static void declaringClasses() {
        Flight flight = new Flight();

        System.out.println("New Flight - seats: " + flight.seats + ", passengers: " + flight.passengers);

        while (flight.passengers < 10) {
            flight.addPassenger();
        }

        System.out.println("Updated Flight - seats: " + flight.seats + ", passengers: " + flight.passengers);
    }
}
