package com.gb.Lesson012.Calculator;

public class Test {

    private float firstNumber;
    private float secondNumber;
    private float sumResult;
    private float subResult;
    private float multiResult;
    private float divResult;

    public Test(float firstNumber,
                 float secondNumber,
                 float sumResult,
                 float subResult,
                 float multiResult,
                 float divResult) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sumResult = sumResult;
        this.subResult = subResult;
        this.multiResult = multiResult;
        this.divResult = divResult;
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public float getSumResult() {
        return sumResult;
    }

    public float getSubResult() {
        return subResult;
    }

    public float getMultiResult() {
        return multiResult;
    }

    public float getDivResult() {
        return divResult;
    }

    public static void main(String[] args) {

        Test test = new Test(
            1,
            1,
            2,
            0,
            1,
            1);

        Model sumModel = new SumModel();
        sumModel.setFirstNumber(test.getFirstNumber());
        sumModel.setSecondNumber(test.getSecondNumber());

        Model subModel = new SubModel();
        subModel.setFirstNumber(test.getFirstNumber());
        subModel.setSecondNumber(test.getSecondNumber());

        Model multiModel = new MultiModel();
        multiModel.setFirstNumber(test.getFirstNumber());
        multiModel.setSecondNumber(test.getSecondNumber());

        Model divModel = new DivModel();
        divModel.setFirstNumber(test.getFirstNumber());
        divModel.setSecondNumber(test.getSecondNumber());

        if (sumModel.calc() != test.getSumResult()) {
            throw new AssertionError("Incorrect result: SumModel");
        }
        if (subModel.calc() != test.getSubResult()) {
            throw new AssertionError("Incorrect result: SubModel");
        }
        if (multiModel.calc() != test.getMultiResult()) {
            throw new AssertionError("Incorrect result: MultiModel");
        }
        if (divModel.calc() != test.getDivResult()) {
            throw new AssertionError("Incorrect result: DivModel");
        }

    }
}
