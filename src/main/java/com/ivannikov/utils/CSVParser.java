package com.ivannikov.utils;

import au.com.bytecode.opencsv.CSVReader;
import com.ivannikov.model.Flat;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CSVParser implements Parser {

    @Override
    public List<Flat> parse(String fileName) throws IOException {
        Locale.setDefault(Locale.ROOT);
        CSVReader reader = new CSVReader(new FileReader(fileName), ';');
        String[] line;
        List<Flat> result = new ArrayList<>();

        while ((line = reader.readNext()) != null) {
            String district = line[0];
            int rooms = Integer.parseInt(line[1]);
            double flatSquare = Double.parseDouble(line[2]);
            double kitchenSquare = Double.parseDouble(line[3]);
            double price = Double.parseDouble(line[4]);
            result.add(new Flat(district, rooms, flatSquare, kitchenSquare, price));
        }

        return result;
    }
}
