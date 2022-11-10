package com.gb.Lesson016.homework;

import java.lang.reflect.Type;

public class DataFormatException extends RuntimeException {
    public DataFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataFormatException(String message) {
        super(message);
    }
}
