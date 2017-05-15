package com.javarush.task.task18_Обертки_CrUD_Округление_ПодсчетСимволов.task1812СоздалИнтерфейсОбертку;

import java.io.IOException;

public interface AmigoOutputStream {
    void flush() throws IOException;

    void write(int b) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}
