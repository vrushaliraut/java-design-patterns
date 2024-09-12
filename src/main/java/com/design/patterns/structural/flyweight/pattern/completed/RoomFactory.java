package com.design.patterns.structural.flyweight.pattern.completed;

import java.util.HashMap;
import java.util.Map;

public class RoomFactory {
    private static Map<String, RoomType> roomTypeMap = new HashMap<>();

    public static RoomType getRoomType(String roomType, String amenities, double rate) {
        String key = roomType + amenities + rate;
        if (!roomTypeMap.containsKey(key)) {
            roomTypeMap.put(key, new RoomType(roomType, amenities, rate));
        }
        return roomTypeMap.get(key);
    }
}
