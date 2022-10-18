/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов двух
входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение,
которое пользователь может увидеть - RuntimeException, т.е. ваше.*/

package com.gb.Lesson014;

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {

        int[] array1 = {2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(divide(array1, array2)));
    }

    public static float[] divide(int[] array1, int[] array2) {

        if (array1 == null || array2 == null) {
            throw new RuntimeException("Array is null");
        }
        else if (array1.length != array2.length) {
            throw new RuntimeException("Arrays are of different size");
        }

        float[] result = new float[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Division by zero");
            }
            result[i] = (float) array1[i] / array2[i];
        }
        return result;
    }

}
