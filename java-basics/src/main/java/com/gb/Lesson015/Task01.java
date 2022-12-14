/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должен приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных. */

package com.gb.Lesson015;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {

    public static float getUserInput() {
        float number = 0f;
        boolean isCorrect = false;
        while (!isCorrect) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите дробное число: ");
            try {
                number = scanner.nextFloat();
                isCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный формат числа! Попробуйте снова!");
            }
        }
        return number;
    }

    public static void main(String[] args) {
        float number = getUserInput();
        System.out.println("Было введено число: " + number);
    }

}
