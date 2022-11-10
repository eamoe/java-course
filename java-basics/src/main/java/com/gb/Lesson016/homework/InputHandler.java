package com.gb.Lesson016.homework;

import java.util.Scanner;

public class InputHandler {

    private final String inputMessage =
        "Введите данные одной строкой в формате (значения долны быть разделены пробелом):\n" +
        "<Фамилия> " +
        "<Имя> " +
        "<Отчество> " +
        "<Дата Рождения в формате dd.mm.yyyy> " +
        "<Номер Телефона> " +
        "<Пол>. ";
    private String userInput;

    public InputHandler() {
        this.userInput = "";
    }

    private void validateInput() {

        String[] parameters = this.userInput.split(" ");
        int arraySize = parameters.length;

        int expectedArraySize = 6;
        if (arraySize != expectedArraySize) {
            throw new DataArrayException(arraySize, expectedArraySize);
        }

    }

    public void inputData() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(inputMessage);
        this.setUserInput(scanner.nextLine());
        this.validateInput();
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
