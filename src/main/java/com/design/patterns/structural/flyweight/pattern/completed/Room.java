package com.design.patterns.structural.flyweight.pattern.completed;

public class Room {
    private int roomNumber;      // Extrinsic
    private String guestName;    // Extrinsic
    private String checkInDate;  // Extrinsic
    private String checkOutDate; // Extrinsic
    private RoomType roomType;   // Intrinsic (shared)

    public Room(int roomNumber, String guestName, String checkInDate, String checkOutDate, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomType = roomType;
    }

    public void displayReservationDetails() {
        roomType.display(roomNumber, guestName, checkInDate, checkOutDate);
    }
}
