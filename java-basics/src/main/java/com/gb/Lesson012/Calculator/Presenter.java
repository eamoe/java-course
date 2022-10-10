package com.gb.Lesson012.Calculator;

public class Presenter {
    private Model model;
    private final View view;
    private String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    private void setModel(String operation) {
        switch (operation) {
            case "+":
                this.model = new SumModel();
                break;
            case "-":
                this.model = new SubModel();
                break;
            case "*":
                this.model = new MultiModel();
                break;
            case "/":
                this.model = new DivModel();
                break;
            default:
                this.model = null;
        }
    }

    public Presenter(View view) {
        this.view = view;
    }

    public void execute() {
        float firstNumber = view.getNumber("Enter first numbers: ");
        this.setOperation(view.getOperation("Enter operation: "));
        this.setModel(this.getOperation());
        float secondNumber = view.getNumber("Enter second numbers: ");
        model.setFirstNumber(firstNumber);
        model.setSecondNumber(secondNumber);
        view.print(model.title() + model.calc());
    }

}
