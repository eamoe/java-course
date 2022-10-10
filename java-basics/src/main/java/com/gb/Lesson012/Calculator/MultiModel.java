package com.gb.Lesson012.Calculator;

public class MultiModel implements Model {
    private float firstNumber;

    private float secondNumber;

    @Override
    public void setFirstNumber(float number) {
        this.firstNumber = number;
    }

    @Override
    public void setSecondNumber(float number) {
        this.secondNumber = number;
    }

    @Override
    public float calc() {
        return this.firstNumber * this.secondNumber;
    }

    @Override
    public String title() {
        return "The multiplication result is ";
    }
}
