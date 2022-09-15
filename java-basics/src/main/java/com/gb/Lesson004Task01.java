// Взять за основу реализацию стека, написанную в конце семенара.
// Добавить проверку граничных условий и выводить сообщения об ошибках,
// если мы пытаемся извлечь элемент из пустого стека,
// добавить элемент в полностью заполненный стек и т.д.

package com.gb;
import com.gb.Stack;

import java.util.Scanner;

public class Lesson004Task01 {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(5);

        System.out.println(stack.isEmpty());
        stack.push("First");
        stack.push("Second");
        stack.push("third");
        stack.push("Forth");
        stack.push("Fifth");
        System.out.println(stack.isFull());
        System.out.println("Последний элемент: " + stack.peek());
        stack.pop();
        System.out.println("Последний элемент: " + stack.peek());
        System.out.println(stack.isFull());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
    }

}
