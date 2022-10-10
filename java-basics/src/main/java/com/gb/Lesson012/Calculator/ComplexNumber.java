package com.gb.Lesson012.Calculator;

import org.jetbrains.annotations.NotNull;

public class ComplexNumber implements Comparable<ComplexNumber> {
    private float real;
    private float imag;

    public ComplexNumber(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImag() {
        return imag;
    }

    public void setImag(float imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" +
            "real=" + real +
            ", imag=" + imag +
            ')';
    }

    @Override
    public int compareTo(@NotNull ComplexNumber o) {
        if (this.real == o.real && this.imag == o.imag) return 0;
        else  return -1;
    }
}
