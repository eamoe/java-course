package com.gb;

public class Wheel implements Checkable {

    public void rotate() {
        System.out.println("Wheel is spinning...");
    }

    public void turnLeft() {
        System.out.println("The wheel was turned left");
    }

    public void turnRight() {
        System.out.println("The wheel was turned right");
    }

    public void moveStraight() {
        System.out.println("The wheel was turned straight");
    }

    @Override
    public void check() {
        System.out.println("Wheel is ok");
    }

}

