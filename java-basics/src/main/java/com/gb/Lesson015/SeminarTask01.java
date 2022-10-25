package com.gb.Lesson015;

public class SeminarTask01 {

    public static int sum2d(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                for (int j = 0; j < 5; j++) {
                    int value;
                    try {
                        value = Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException | NullPointerException e) {
                        value = 0;
                        e.printStackTrace();
                    }
                    sum += value;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new RuntimeException("Index is out of bounds!");
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[][] array = {{"1", "2", "3", "4", "4"}, {"6", "7", "8"}};
        System.out.println(sum2d(array));

    }

}
