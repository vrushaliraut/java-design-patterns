package com.design.patterns.structural.flyweight.pattern.starter;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    private List<Room> rooms = new ArrayList<>();

    public void bookRoom(String roomType, String amenities, double rate, int roomNumber,
                         String guestName, String checkInDate, String checkOutDate) {
        Room room = new Room(roomType, amenities, rate, roomNumber, guestName, checkInDate, checkOutDate);
        rooms.add(room);
    }

    public void displayAllReservations() {
        for (Room room : rooms) {
            room.displayReservationDetails();
        }
    }

}
