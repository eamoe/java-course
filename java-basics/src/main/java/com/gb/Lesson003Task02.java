// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее из этого списка.

package com.gb;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson003Task02 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int size = scanner.nextInt();

        Random random = new Random();
        for (int i = 0; i < size; i++){
            numbers.add(random.nextInt(100));
        }

        int number = numbers.get(0);
        int min = number;
        int max = number;
        int sum = 0;
        float average = 0.0F;
        for (int i = 0; i < size; i++){

            number = numbers.get(i);
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        average = (float) sum / size;

        System.out.println("Список: " + numbers.toString());
        System.out.println("Минимальное значение списка: " + min);
        System.out.println("Максимальное значение списка: " + max);
        System.out.println("Арифметическое среднее: " + average);
    }
}
