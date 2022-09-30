package com.gb;

public class MechanicalTransmission extends Transmission {
    @Override
    public void switchGearInternal(int gearNumber) {
        System.out.println("Mechanical transmission");
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
