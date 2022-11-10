package com.gb.Lesson016.homework;

public class DataArrayException extends RuntimeException {

    public DataArrayException(int size) {
        super("Incorrect input. Parameters received: " + size);
    }
}
