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

        view.print("Sum is " + model.calc());
    }

    private static class MockView implements View {

        private int count = 0;

        @Override
        public int getValue(String message) {
            count++;
            return 1;
        }

        @Override
        public void print(String message) {
            if (!message.equals("Sum is 2")) {
                throw new AssertionError("Incorrect sum");
            }
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Model sumModel = new SumModel();
        MockView mockView = new MockView();
        Presenter presenter = new Presenter(sumModel, mockView);

        presenter.execute();
        if (mockView.getCount() != 2) {
            throw new AssertionError("Incorrect call of getValue()");
        }
    }


}
