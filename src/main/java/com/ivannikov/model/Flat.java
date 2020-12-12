package com.ivannikov.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Flat {

    @Getter
    private final String district;
    @Getter
    private final int rooms;
    @Getter
    private final double flatSquare;
    @Getter
    private final double kitchenSquare;
    @Getter
    private final double price;

    public Flat(String district, int rooms, double flatSquare, double kitchenSquare, double price) {
        this.district = district;
        this.rooms = rooms;
        this.flatSquare = flatSquare;
        this.kitchenSquare = kitchenSquare;
        this.price = price;
    }

}
