package com.design.patterns.structural.flyweight.pattern.starter;

public class Room {
    private String roomType;    // Intrinsic (shared)
    private String amenities;   // Intrinsic (shared)
    private double rate;        // Intrinsic (shared)
    private int roomNumber;     // Extrinsic (unique)
    private String guestName;   // Extrinsic (unique)
    private String checkInDate; // Extrinsic (unique)
    private String checkOutDate;// Extrinsic (unique)

    public Room(String roomType, String amenities, double rate, int roomNumber,
                String guestName, String checkInDate, String checkOutDate) {
        this.roomType = roomType;
        this.amenities = amenities;
        this.rate = rate;
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void displayReservationDetails() {
        System.out.println("Room Number: " + roomNumber + " | Room Type: " + roomType +
                " | Amenities: " + amenities + " | Rate: " + rate +
                " | Guest: " + guestName + " | Check-In: " + checkInDate +
                " | Check-Out: " + checkOutDate);
    }
}
