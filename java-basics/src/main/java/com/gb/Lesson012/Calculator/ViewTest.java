package com.gb.Lesson012.Calculator;

public class ViewTest {
    private static class MockView implements View {

        private int NumberCount = 0;
        private int OperationCount = 0;

        public int getOperationCount() {
            return OperationCount;
        }

        @Override
        public float getNumber(String message) {
            this.NumberCount++;
            return 1;
        }

        @Override
        public String getOperation(String message) {
            this.OperationCount++;
            return "+";
        }

        @Override
        public void print(String message) {
            if (!message.equals("The addition result is (real=2.0, imag=2.0)")) {
                throw new AssertionError("Incorrect sum");
            }
        }

        public int getNumberCount() {
            return this.NumberCount;
        }
    }

    public static void main(String[] args) {
        MockView mockView = new MockView();
        Presenter presenter = new Presenter(mockView);

        presenter.execute();
        if (mockView.getNumberCount() != 4) {
            throw new AssertionError("Incorrect call of getNumber()");
        }
        if (mockView.getOperationCount() != 1) {
            throw new AssertionError("Incorrect call of getOperation()");
        }
    }
}
