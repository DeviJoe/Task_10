package com.ivannikov.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return rooms == flat.rooms &&
                Double.compare(flat.flatSquare, flatSquare) == 0 &&
                Double.compare(flat.kitchenSquare, kitchenSquare) == 0 &&
                Double.compare(flat.price, price) == 0 &&
                Objects.equals(district, flat.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(district, rooms, flatSquare, kitchenSquare, price);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "district='" + district + '\'' +
                ", rooms=" + rooms +
                ", flatSquare=" + flatSquare +
                ", kitchenSquare=" + kitchenSquare +
                ", price=" + price +
                '}';
    }
}
