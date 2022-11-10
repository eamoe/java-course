package com.gb.Lesson016.homework;

public class DataArrayException extends RuntimeException {

    public DataArrayException(int receivedParams, int expectedParams) {
        super("Incorrect input. Got " + receivedParams + " parameter(s) while expecting " + expectedParams);
    }
}
