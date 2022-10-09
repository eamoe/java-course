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
