package com.gb.Lesson009;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class EvenIndexChars implements Iterable<Character> {

    private final String str;

    public EvenIndexChars(String str) {
        this.str = str;
    }

    @NotNull
    @Override
    public Iterator<Character> iterator() {
        return new Iterator<>() {
            private int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < str.length();
            }

            @Override
            public Character next() {
                char evenChar = str.charAt(counter);
                counter += 2;
                return evenChar;
            }
        };
    }

    public static void main(String[] args) {
        EvenIndexChars evenIndexChars = new EvenIndexChars("0123456789");
        for (Character evenIndexChar : evenIndexChars) {
            System.out.println(evenIndexChar);
        }
    }

}
