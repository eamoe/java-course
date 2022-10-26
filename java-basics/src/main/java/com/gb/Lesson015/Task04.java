/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

package com.gb.Lesson015;

import java.util.Scanner;

public class Task04 {

    public static String getUserInput() {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        userInput = scanner.nextLine();
        if (userInput.isBlank()) {
            throw new RuntimeException("Пустая строка!");
        }
        return userInput;
    }

    public static void main(String[] args) {
        String string = getUserInput();
        System.out.println("Введена строка: " + string);
    }

}
