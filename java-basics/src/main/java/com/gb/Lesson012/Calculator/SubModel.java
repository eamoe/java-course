package com.gb.Lesson012.Calculator;

public class SubModel implements Model {
    private ComplexNumber firstNumber;

    private ComplexNumber secondNumber;
    @Override
    public void setFirstNumber(ComplexNumber number) {
        this.firstNumber = number;
    }

    @Override
    public void setSecondNumber(ComplexNumber number) {
        this.secondNumber = number;
    }

    @Override
    public ComplexNumber calc() {
        return new ComplexNumber(this.firstNumber.getReal() - this.secondNumber.getReal(),
            this.firstNumber.getImag() - this.secondNumber.getImag());
    }

    @Override
    public String title() {
        return "The result of subtraction is ";
    }
}
