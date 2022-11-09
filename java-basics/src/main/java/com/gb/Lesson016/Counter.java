/* Создайте класс Счетчик, у которого есть метод add(),
увеличивающий значение внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт.
Подумайте какой тип исключения подойдет лучше всего.*/

package com.gb.Lesson016;

public class Counter implements AutoCloseable {
    private int counter;
    private boolean isClosed;

    public void increment() {
        if (isClosed) {
            throw new IllegalStateException("The counter is already closed!");
        }
        counter++;
    }

    public static void main(String[] args) {
        try (Counter counter = new Counter();) {
            counter.increment();
            counter.increment();
            counter.increment();
            counter.increment();
            counter.increment();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {
        if (isClosed) {
            throw new IllegalStateException("The counter is already closed!");
        }
        isClosed = true;
    }
}
