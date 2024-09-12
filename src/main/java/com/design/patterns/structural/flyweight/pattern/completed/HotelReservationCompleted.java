package com.design.patterns.structural.flyweight.pattern.completed;


public class HotelReservationCompleted {
    public static void main(String[] args) {
        HotelReservation reservationSystem = new HotelReservation();
        reservationSystem.bookRoom("Single", "WiFi, TV", 100, 101, "John Doe", "2024-09-15", "2024-09-18");
        reservationSystem.bookRoom("Single", "WiFi, TV", 100, 102, "Jane Doe", "2024-09-16", "2024-09-19");
        reservationSystem.bookRoom("Double", "WiFi, TV, Balcony", 200, 201, "Alice Smith", "2024-09-17", "2024-09-20");

        reservationSystem.displayAllReservations();
    }
}
