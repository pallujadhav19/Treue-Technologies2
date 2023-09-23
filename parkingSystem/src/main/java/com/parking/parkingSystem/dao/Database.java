package com.parking.parkingSystem.dao;

import java.util.*;


import com.parking.parkingSystem.entity.ParkingSlot;

public class Database {
    public static List<ParkingSlot> slots = new ArrayList<>();

    static {
        slots.add(new ParkingSlot(1, "Slot 1"));
        slots.add(new ParkingSlot(2, "Slot 2"));
        slots.add(new ParkingSlot(3, "Slot 3"));
    }
}
