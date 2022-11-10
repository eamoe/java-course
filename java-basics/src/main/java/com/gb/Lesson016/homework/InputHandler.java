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
    private final int inputArraySize = 6;
    private String userInput;

    public InputHandler() {
        this.userInput = "";
    }

    private void validateInput() {

        String[] parameters = this.userInput.split(" ");
        int arraySize = parameters.length;

        if (arraySize != this.inputArraySize) {
            throw new DataArrayException(arraySize);
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
