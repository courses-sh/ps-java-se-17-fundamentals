package org.example.classes;

public class Flight {
    int passengers;
    int seats;

    Flight() {
        passengers = 0;
        seats = 150;
    }

    void addPassenger() {
        if (passengers < seats) {
            passengers += 1;
        }
    }
}
