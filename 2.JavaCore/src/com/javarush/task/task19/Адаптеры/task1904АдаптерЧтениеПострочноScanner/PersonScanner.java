package com.javarush.task.task19.Адаптеры.task1904АдаптерЧтениеПострочноScanner;

import java.io.IOException;
import java.text.ParseException;

public interface PersonScanner {
    Person read() throws IOException, ParseException;

    void close() throws IOException;
}
