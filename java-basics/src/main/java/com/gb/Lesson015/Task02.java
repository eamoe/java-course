/* Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */

package com.gb.Lesson015;

public class Task02 {

    public static void catchException(int[] intArray) {

        try {
            int d = 0;
            double caughtRes1 = intArray[8] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Index is out of bounds!");
        } catch (NullPointerException ex) {
            System.out.println("Array is null!");
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        catchException(array);
    }

}
