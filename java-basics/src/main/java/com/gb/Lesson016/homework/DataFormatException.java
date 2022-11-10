package com.gb.Lesson016.homework;

import java.lang.reflect.Type;

public class DataFormatException extends RuntimeException {

    public DataFormatException(String data, String dataType) {
        super("Cannot parse \"" + data + "\" to " + dataType);
    }

}
