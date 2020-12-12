package com.ivannikov.utils;

import com.ivannikov.model.Flat;
import java.io.IOException;
import java.util.List;

public interface Parser {

    /**
     * Метод производит парсинг csv таблицы в представление для программы
     * @param fileName путь до файла
     * @return лист квартир Flat
     * @see Flat
     * @throws IOException возникающие ошибки
     */
    List<Flat> parse(String fileName) throws IOException;

}
