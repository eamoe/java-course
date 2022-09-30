package com.gb;

public class AutomaticTransmission extends Transmission {
    @Override
    public void switchGearInternal(int gearNumber) {
        System.out.println("Automatic transmission");
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
}
