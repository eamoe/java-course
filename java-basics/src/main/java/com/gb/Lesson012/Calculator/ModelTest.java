package com.gb.Lesson012.Calculator;

public class ModelTest {

    private ComplexNumber firstNumber;
    private ComplexNumber secondNumber;
    private ComplexNumber sumResult;
    private ComplexNumber subResult;
    private ComplexNumber multiResult;
    private ComplexNumber divResult;

    public ModelTest(ComplexNumber firstNumber,
                ComplexNumber secondNumber,
                ComplexNumber sumResult,
                ComplexNumber subResult,
                ComplexNumber multiResult,
                ComplexNumber divResult) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sumResult = sumResult;
        this.subResult = subResult;
        this.multiResult = multiResult;
        this.divResult = divResult;
    }

    public ComplexNumber getFirstNumber() {
        return firstNumber;
    }

    public ComplexNumber getSecondNumber() {
        return secondNumber;
    }

    public ComplexNumber getSumResult() {
        return sumResult;
    }

    public ComplexNumber getSubResult() {
        return subResult;
    }

    public ComplexNumber getMultiResult() {
        return multiResult;
    }

    public ComplexNumber getDivResult() {
        return divResult;
    }

    public static void main(String[] args) {

        ModelTest test = new ModelTest(
            new ComplexNumber(2, 7), // First number
            new ComplexNumber(3, 5), // second number
            new ComplexNumber(5, 12), // Sum
            new ComplexNumber(-1, 2), // Subtraction
            new ComplexNumber(-29, 31), // Multiplication
            new ComplexNumber(41/34f, 11/34f)); // Division

//        ModelTest test = new ModelTest(
//            new ComplexNumber(8, 0), // First number
//            new ComplexNumber(4, 0), // second number
//            new ComplexNumber(12, 0), // Sum
//            new ComplexNumber(4, 0), // Subtraction
//            new ComplexNumber(32, 0), // Multiplication
//            new ComplexNumber(2f, 0)); // Division

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

        if (sumModel.calc().compareTo(test.getSumResult()) != 0) {
            throw new AssertionError("Incorrect result: SumModel");
        }
        if (subModel.calc().compareTo(test.getSubResult()) != 0) {
            throw new AssertionError("Incorrect result: SubModel");
        }
        if (multiModel.calc().compareTo(test.getMultiResult()) != 0) {
            throw new AssertionError("Incorrect result: MultiModel");
        }
        if (divModel.calc().compareTo(test.getDivResult()) != 0) {
            throw new AssertionError("Incorrect result: DivModel");
        }

    }
}
