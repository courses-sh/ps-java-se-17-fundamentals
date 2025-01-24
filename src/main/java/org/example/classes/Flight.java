package org.example.classes;

public class Flight {
    int passengers;
    private int seats;
    private int flightNumber;

    public Flight() {
        passengers = 0;
        seats = 150;
    }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    // getter
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void addPassenger() {
        if (passengers < seats) {
            passengers += 1;
        } else {
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too many!!!");
    }

    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= seats;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Flight)) {
            return false;
        }

        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber;
    }
}
