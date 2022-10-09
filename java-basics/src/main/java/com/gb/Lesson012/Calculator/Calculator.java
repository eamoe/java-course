/* 1. Взять за основу код калькулятора, написанный на уроке.
Добавить в него четыре арифметических действия.
Подумать над автоматическими тестами в методе main, которые нужно дописать.
2*. Доработать калькулятор, чтобы он мог работать с рациональными и комплексными числами (необязательно) */

package com.gb.Lesson012.Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SumModel sumModel = new SumModel();
        View view = new ViewImplementation(scn, System.out);
        Presenter presenter = new Presenter(sumModel, view);
        presenter.execute();
    }

}
