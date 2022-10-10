package com.gb.Lesson012.Calculator;

public class MultiModel implements Model {
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
        float real = this.firstNumber.getReal() * this.secondNumber.getReal()
            - this.firstNumber.getImag() * this.secondNumber.getImag();
        float imag = this.firstNumber.getReal() * this.secondNumber.getImag()
            + this.firstNumber.getImag() * this.secondNumber.getReal();
        return new ComplexNumber(real, imag);
    }

    @Override
    public String title() {
        return "The multiplication result is ";
    }
}
