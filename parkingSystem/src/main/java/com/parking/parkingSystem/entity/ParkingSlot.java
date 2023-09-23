package com.parking.parkingSystem.entity;

public class ParkingSlot {
    private int id;
    private String slotName;
    private boolean booked;

    public ParkingSlot(int id, String slotName) {
        this.id = id;
        this.slotName = slotName;
        this.booked = false;
    }

    public int getId() {
        return id;
    }

    public String getSlotName() {
        return slotName;
    }

    public boolean isBooked() {
        return booked;
    }

    public void bookSlot() {
        this.booked = true;
    }
}
