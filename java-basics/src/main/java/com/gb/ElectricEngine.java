package com.gb;

public class ElectricEngine extends Engine {
    @Override
    protected void startInternal() {
        System.out.println("Electric engine has started");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Electric engine has stopped");
    }

    @Override
    protected void accelerateInternal(int level) {
        System.out.println("Electric engine is accelerating");
    }

    @Override
    public void check() {
        System.out.println("Engine is ok");
    }
}
