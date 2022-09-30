package com.gb;

enum Movement {BACKWARD, NEUTRAL, FORWARD}

public class Transmission implements Checkable {
    private int gearNumber;

    private Movement movement;

    public void switchGear (int gearNumber) {
        setGearNumber(gearNumber);

        if (getGearNumber() == 0) {
            setDirection(Movement.NEUTRAL);
        } else if (getGearNumber() < 0) {
            setDirection(Movement.BACKWARD);
        }
        else {
            setDirection(Movement.FORWARD);
        }

        System.out.printf("Gear shifted to %d. Direction: %s%n", getGearNumber(), getDirection());
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }

    public Movement getDirection() {
        return movement;
    }

    public void setDirection(Movement movement) {
        this.movement = movement;
    }
    @Override
    public void check() {
        System.out.println("Transmission is ok");
    }

}
