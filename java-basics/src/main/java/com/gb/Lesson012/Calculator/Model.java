package com.gb.Lesson012.Calculator;

public interface Model {

    void setFirstNumber(float number);
    void setSecondNumber(float number);

    float calc();

    String title();

//    public static void main(String[] args) {
//        Model model = new Model();
//
//        model.setFirst(1);
//        model.setSecond(1);
//        if (model.getSum() != 2) {
//            throw new AssertionError("Incorrect test result");
//        }
//
//        model.setFirst(1);
//        model.setSecond(2);
//        if (model.getSum() != 3) {
//            throw new AssertionError("Incorrect test result");
//        }
//
//        model.setFirst(2);
//        model.setSecond(3);
//        if (model.getSum() != 5) {
//            throw new AssertionError("Incorrect test result");
//        }
//    }

}
