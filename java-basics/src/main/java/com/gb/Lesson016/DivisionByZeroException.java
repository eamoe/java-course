/*
Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
*/

package com.gb.Lesson016;

public class DivisionByZeroException extends RuntimeException {

    public DivisionByZeroException() {
        super("Division by zero");
    }

    public DivisionByZeroException(String message) {
        super(message);
    }
}
