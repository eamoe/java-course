package com.gb.Lesson009;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Numbers implements Iterable<Integer>  {

    private final int start;
    private final int end;

    public Numbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int counter = start;

            @Override
            public boolean hasNext() {
                return counter <= end;
            }

            @Override
            public Integer next() {
                return counter++;
            }
        };
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers(1, 10);
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }

}
