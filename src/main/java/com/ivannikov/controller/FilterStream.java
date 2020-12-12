package com.ivannikov.controller;

import com.ivannikov.model.Flat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilterStream {

    List<Flat> database;

    public FilterStream(List<Flat> database) {
        this.database = Collections.unmodifiableList(database);
    }

    public FilterStream filterByDistrict(String district) {
        if (database == null) return null;
        List<Flat> result = new ArrayList<>();
        if (district == null) return this;
        else {
            for (Flat flat : database) {
                if (flat.getDistrict().equals(district)) result.add(flat);
            }
         }
        return new FilterStream(result);
    }

    public FilterStream filterByRooms(Integer down, Integer top) {
        if (database == null) return null;
        List<Flat> result = new ArrayList<>();
        if (down == null && top == null) return this;
        for (Flat flat : this.database) {
            if (down != null && top != null) {
                if (flat.getRooms() >= down && flat.getRooms() <= top) result.add(flat);
            }
            if (down != null && top == null) {
                if (flat.getRooms() >= down) result.add(flat);
            }
            if (down == null) {
                if (flat.getRooms() <= top) result.add(flat);
            }
        }

        return new FilterStream(result);
    }

    public FilterStream filterByKitchenSquare(Double down, Double top) {
        if (database == null) return null;
        List<Flat> result = new ArrayList<>();

        if (down == null && top == null) return this;

        for (Flat flat : this.database) {
            if (down != null && top != null) {
                if (flat.getKitchenSquare() >= down && flat.getKitchenSquare() <= top) result.add(flat);
            }
            if (down != null && top == null) {
                if (flat.getKitchenSquare() >= down) result.add(flat);
            }
            if (down == null) {
                if (flat.getKitchenSquare() <= top) result.add(flat);
            }
        }

        return new FilterStream(result);
    }

    public FilterStream filterByPrice(Double down, Double top) {
        if (database == null) return null;
        List<Flat> result = new ArrayList<>();

        if (down == null && top == null) return this;

        for (Flat flat : this.database) {
            if (down != null && top != null) {
                if (flat.getPrice() >= down && flat.getPrice() <= top) result.add(flat);
            }
            if (down != null && top == null) {
                if (flat.getPrice() >= down) result.add(flat);
            }
            if (down == null) {
                if (flat.getPrice() <= top) result.add(flat);
            }
        }

        return new FilterStream(result);
    }

    public FilterStream filterByFlatSquare(Double down, Double top) {
        if (database == null) return null;
        List<Flat> result = new ArrayList<>();

        if (down == null && top == null) return this;

        for (Flat flat : this.database) {
            if (down != null && top != null) {
                if (flat.getFlatSquare() >= down && flat.getFlatSquare() <= top) result.add(flat);
            }
            if (down != null && top == null) {
                if (flat.getFlatSquare() >= down) result.add(flat);
            }
            if (down == null) {
                if (flat.getFlatSquare() <= top) result.add(flat);
            }
        }

        return new FilterStream(result);
    }


    public List<Flat> toList() {
        return database;
    }

    public static FilterStream filter(List<Flat> list) {
        return new FilterStream(list);
    }
}
