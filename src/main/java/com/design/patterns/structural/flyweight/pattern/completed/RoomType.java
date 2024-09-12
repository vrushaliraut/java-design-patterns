package com.design.patterns.structural.flyweight.pattern.completed;

public class RoomType {
    private String roomType;  // Intrinsic
    private String amenities; // Intrinsic
    private double rate;      // Intrinsic

    public RoomType(String roomType, String amenities, double rate) {
        this.roomType = roomType;
        this.amenities = amenities;
        this.rate = rate;
    }

    public void display(int roomNumber, String guestName, String checkInDate, String checkOutDate) {
        System.out.println("Room Number: " + roomNumber + " | Room Type: " + roomType +
                " | Amenities: " + amenities + " | Rate: " + rate +
                " | Guest: " + guestName + " | Check-In: " + checkInDate +
                " | Check-Out: " + checkOutDate);
    }
}
