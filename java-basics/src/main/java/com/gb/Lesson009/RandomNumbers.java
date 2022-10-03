// Написать итератор, который будет выдавать N случайных целых чисел

package com.gb.Lesson009;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class RandomNumbers implements Iterable<Integer> {
    private final int quantity;
    private final int min;
    private final int max;

    public RandomNumbers(int quantity, int min, int max) {
        this.quantity = quantity;
        this.min = min;
        this.max = max;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < quantity;
            }

            @Override
            public Integer next() {
                counter++;
                return (min + (int) (Math.random() * ((max - min) + 1)));
            }
        };
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers(5, 10, 15);
        for (Integer randomNumber : randomNumbers) {
            System.out.println(randomNumber);
        }
    }

}
