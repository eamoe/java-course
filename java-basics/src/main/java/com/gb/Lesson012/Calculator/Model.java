package com.gb.Lesson012.Calculator;

public interface Model {

    void setFirstNumber(ComplexNumber number);
    void setSecondNumber(ComplexNumber number);

    ComplexNumber calc();

    String title();

}
