
package com.gb;

public class Stack <T> {
        private T[] array;
        private int top;
        private final int MAX_SIZE;

        public Stack(int size) {
            this.array = (T[]) new Object[size];
            this.top = -1;
            this.MAX_SIZE = size;
        }

        public int size() {
            return this.top + 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == MAX_SIZE - 1;
        }

        public void push(T item) {
            if (this.isFull()) {
                System.out.println("Переполнение стека. Завершение работы!\n");
                System.exit(-1);
            }
            else {
                this.array[++top] = item;
            }
        }

        public T peek() {
            if (this.isEmpty()) {
                System.out.println("Стек пуст. Завершение работы!\n");
                System.exit(-1);
            }
            return this.array[top];
        }

        public T pop() {
            if (this.isEmpty()) {
                System.out.println("Извлечение данных из пустого стека. Завершение работы!\n");
                System.exit(-1);
            }
            System.out.println("Удаление элемента: " + peek());
            return array[top--];
        }
}
