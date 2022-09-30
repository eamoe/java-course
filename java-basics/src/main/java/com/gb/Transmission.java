package com.gb;

enum Movement {BACKWARD, NEUTRAL, FORWARD}

public abstract class Transmission implements Checkable, Parkable {
    private int gearNumber;

    private Movement movement;

    public void switchGear (int gearNumber) {
        System.out.println("Transmission...".toUpperCase());
        switchGearInternal(gearNumber);
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

    public abstract void switchGearInternal(int gearNumber);

}
