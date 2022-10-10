package com.gb.Lesson012.Calculator;

public class DivModel implements Model {
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
        float realTop = this.firstNumber.getReal() * this.secondNumber.getReal()
            + this.firstNumber.getImag() * this.secondNumber.getImag();
        float bottom = this.secondNumber.getReal() * this.secondNumber.getReal()
            + this.secondNumber.getImag() * this.secondNumber.getImag();
        float imagTop = this.firstNumber.getImag() * this.secondNumber.getReal()
            - this.firstNumber.getReal() * this.secondNumber.getImag();
        return new ComplexNumber(realTop / bottom, imagTop / bottom);
    }

    @Override
    public String title() {
        return "The division result is ";
    }
}
