package com.ivannikov.model;

public class Flat {

    private final String district;
    private final int rooms;
    private final double flatSquare;
    private final double kitchenSquare;
    private final double price;

    public Flat(String district, int rooms, double flatSquare, double kitchenSquare, double price) {
        this.district = district;
        this.rooms = rooms;
        this.flatSquare = flatSquare;
        this.kitchenSquare = kitchenSquare;
        this.price = price;
    }

    public String getDistrict() {
        return district;
    }

    public int getRooms() {
        return rooms;
    }

    public double getFlatSquare() {
        return flatSquare;
    }

    public double getKitchenSquare() {
        return kitchenSquare;
    }

    public double getPrice() {
        return price;
    }
}
