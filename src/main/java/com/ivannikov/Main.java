package com.ivannikov;

import com.ivannikov.controller.FilterStream;
import com.ivannikov.utils.CSVParser;
import com.ivannikov.utils.Parser;
import com.ivannikov.model.Flat;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Parser parser = new CSVParser();

        List<Flat> list = parser.parse("./database.csv");

        List<Flat> result = FilterStream
                .filter(list)
                .filterByRooms(4, null)
                .filterByDistrict("Central")
                .toList();

        System.out.println();

    }
}
