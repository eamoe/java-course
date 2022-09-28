package com.gb;

enum Direction {STRAIGHT, LEFT, RIGHT};

public class SteeringWheel {

    private Direction direction;

    public void turnLeft() {
        this.direction = Direction.LEFT;
        System.out.println("Turning left...");
    }

    public void turnRight() {
        this.direction = Direction.RIGHT;
        System.out.println("Turning right...");
    }

    public void moveStraight() {
        this.direction = Direction.STRAIGHT;
        System.out.println("Moving straight...");
    }

}
