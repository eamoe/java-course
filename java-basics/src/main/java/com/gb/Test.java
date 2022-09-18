package com.gb;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test {

    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    // A constant that is available by any method of any class
    // External availability through 'public' keyword
    public static final double PI = 3.14;
    public static void main(String[] args) throws IOException {
        final double CM_PER_INCH = 2.54; // Introduce a constant with 'final' keyword

        Size size = Size.MEDIUM;

        double x = 9.997;
        // Correct way to use Round while converting to 'int' because Round converts to 'long' by default
        int nx = (int) Math.round(x);
        //System.out.println((byte) 300);
        String all = String.join(" / ", "S", "M", "L", "XL");
        //System.out.println(all);
        // Check if the string is neither null nor empty
        //if (str != null && str.length() != 0)

        StringBuilder builder = new StringBuilder();
        builder.append("one");
        builder.append("two");
        String completedString =builder.toString();

        // Prints formatted date/ time
        //System.out.printf("%s %tB %<te, %<tY", "Due date: ", new Date());

        String [] names = new String[10]; // == [null, null, ..., null]
        Boolean [] values = new Boolean[10]; // == [null, null, ..., null]
        Integer [] numbers = new Integer[10]; // == [null, null, ..., null]

        int [] intNumbers = {1, 2, 3, 5, 7};
        for (int item : intNumbers) {
            //System.out.println(item);
        }
        //System.out.println(Arrays.toString(intNumbers));

        // Copy and extend array
        int [] copiedNumbers = Arrays.copyOf(intNumbers, 2 * intNumbers.length);
        //System.out.println(Arrays.toString(copiedNumbers));

        
    }
}
