// Пусть дан произвольный список целых чисел, удалить из него четные числа

package com.gb;

import java.util.*;

public class Lesson003Task01 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int size = scanner.nextInt();

        Random random = new Random();
        for (int i = 0; i < size; i++){
            numbers.add(random.nextInt(100));
        }

        System.out.println("Исходный список: " + numbers.toString());

        int i = numbers.size() - 1;
        while (i >= 0) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
            i--;
        }

        System.out.println("Список после удаления четных чисел: " + numbers.toString());
    }
}
