/*
Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

В методе main() вызвать полученный метод,
обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
*/

package com.gb.Lesson016;

import java.util.Arrays;

public class Task03 {

    public static void checkArraySize(String[][] stringsArray) {

        if (stringsArray.length != 4) {
            throw new MyArraySizeException(stringsArray.length);
        }

        int sum = 0;
        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i].length != 4) {
                throw new MyArraySizeException(stringsArray.length, stringsArray[i].length);
            }
            for (int j = 0; j < stringsArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(stringsArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(stringsArray[i][j], e);
                }
            }
        }

    }

    public static class MyArraySizeException extends RuntimeException {

        public MyArraySizeException(int i, int j) {
            super("Incorrect array size: " + i + "x" + j);
        }

        public MyArraySizeException(int i) {
            super("Incorrect array size: " + i);
        }

    }

    public static class MyArrayDataException extends RuntimeException {

        public MyArrayDataException() {

        }

        public MyArrayDataException(String message, Throwable cause) {
            super("Incorrect array value: " + message, cause);
        }
    }

    public static void main(String[] args) {
        String[][] strings = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        checkArraySize(strings);
    }

}
