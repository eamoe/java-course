package com.gb.Lesson014;

public class Seminar {

    static final int INDEX = 11;

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(findNumber(array));
    }

    /**
     * The method returns array length if the length less than INDEX.
     * Otherwise, it returns -1.
     * @param array
     * @return array length if the length less than INDEX. Otherwise, -1.
     */
    public static int findNumber(int[] array) {
        if (array.length < INDEX) {
            return -1;
        }
        else {
            return array.length;
        }
    }

}
