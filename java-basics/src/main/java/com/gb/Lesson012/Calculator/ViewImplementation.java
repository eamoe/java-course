package com.gb.Lesson012.Calculator;

import java.io.PrintStream;
import java.util.Scanner;

public class ViewImplementation implements View {

    private final Scanner scn;

    private final PrintStream out;

    public ViewImplementation(Scanner scn, PrintStream out) {
        this.scn = scn;
        this.out = out;
    }

    @Override
    public int getValue(String message) {
        out.print(message);
        return scn.nextInt();
    }

    @Override
    public void print(String message) {
        out.print(message);
    }

}
