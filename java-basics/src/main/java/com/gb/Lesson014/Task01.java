/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух
входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

package com.gb.Lesson014;

import java.util.Arrays;

public class Task01 {

    public static void main(String[] args) {

        int[] array1 = {2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(diff(array1, array2)));
    }

    public static int[] diff(int[] array1, int[] array2) {

        if (array1 == null || array2 == null) {
            throw new RuntimeException("Array is null");
        }
        else if (array1.length != array2.length) {
            throw new RuntimeException("Arrays are of different size");
        }

        int[] diffArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            diffArray[i] = array1[i] - array2[i];
        }
        return diffArray;
    }
}
