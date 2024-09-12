package com.design.patterns.structural.flyweight.pattern.completed;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    private List<Room> rooms = new ArrayList<>();

    public void bookRoom(String roomType, String amenities, double rate, int roomNumber,
                         String guestName, String checkInDate, String checkOutDate) {
        RoomType type = RoomFactory.getRoomType(roomType, amenities, rate);
        Room room = new Room(roomNumber, guestName, checkInDate, checkOutDate, type);
        rooms.add(room);
    }

    public void displayAllReservations() {
        for (Room room : rooms) {
            room.displayReservationDetails();
        }
    }
}
