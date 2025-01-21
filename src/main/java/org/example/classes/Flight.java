package org.example.classes;

public class Flight {
    int passengers;
    int seats;

    public Flight() {
        passengers = 0;
        seats = 150;
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
}
