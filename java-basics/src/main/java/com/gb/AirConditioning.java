package com.gb;

public class AirConditioning implements Checkable {

    private boolean isOn;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }
    @Override
    public void check() {
        System.out.println("Air conditioning is ok");
    }

}
