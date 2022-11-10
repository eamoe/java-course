/*
Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
*/

package com.gb.Lesson016;

import java.util.Arrays;

public class NullArrayItemException extends RuntimeException {

    public NullArrayItemException(int[] indexes) {
        super("Array item is null for the following indexes: " + Arrays.toString(indexes));
    }

    public static void main(String[] args) {
        String[] strings = {null, "String 1", null, "String 2", "String 3", "String 4", "String 5"};
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                throw new NullArrayItemException(new int[] {i});
            }
        }
    }
}
