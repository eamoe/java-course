package com.gb.Lesson012.Calculator;

public class Presenter {

    private final Model model;

    private final View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        model.setFirstNumber(view.getValue("Enter first number "));
        model.setSecondNumber(view.getValue("Enter second number "));

        view.print(model.title() + model.calc());
    }

}
