package com.gb.Lesson012.Calculator;

public class SumModel implements Model {

    private int firstNumber;

    private int secondNumber;

    @Override
    public void setFirstNumber(int number) {
        this.firstNumber = number;
    }

    @Override
    public void setSecondNumber(int number) {
        this.secondNumber = number;
    }

    @Override
    public int calc() {
        return this.firstNumber + this.secondNumber;
    }
}
