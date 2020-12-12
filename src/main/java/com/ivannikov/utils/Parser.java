package com.ivannikov.utils;

import com.ivannikov.model.Flat;
import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Parser {

    List<Flat> parse(String fileName) throws IOException;

}
