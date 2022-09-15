package com.gb;

public class Test {

    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    // A constant that is available by any method of any class
    // External availability through 'public' keyword
    public static final double PI = 3.14;
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54; // Introduce a constant with 'final' keyword

        Size size = Size.MEDIUM;

        double x = 9.997;
        // Correct way to use Round while converting to 'int' because Round converts to 'long' by default
        int nx = (int) Math.round(x);
        //System.out.println((byte) 300);
        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);
        // Check if the string is neither null nor empty
        //if (str != null && str.length() != 0)

        StringBuilder builder = new StringBuilder();
        builder.append("one");
        builder.append("two");
        String completedString =builder.toString();
    }
}
