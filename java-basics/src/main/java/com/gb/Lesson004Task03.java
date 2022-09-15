// Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
// Вычислить запись если это возможно.

package com.gb;
import java.util.Stack;
import com.gb.InfixPostfixNotation;

public class Lesson004Task03 {

    public static void main(String[] args) {
        InfixPostfixNotation ipn = new InfixPostfixNotation("(1+2^2)*3 + 2/(1 + 1)");
        System.out.println("Инфиксная форма записи: " + ipn.getInfix());
        System.out.println("Постфиксная форма записи до расчета: " + ipn.getPostfix());
        String postfixExp = ipn.toPostfix(ipn.getInfix());
        System.out.println("Постфиксная форма записи: " + postfixExp);
        System.out.println("Результат: " + ipn.calcExpression(postfixExp));
    }
}

