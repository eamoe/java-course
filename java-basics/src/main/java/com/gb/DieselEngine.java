package com.gb;

public class DieselEngine extends Engine {
    @Override
    protected void startInternal() {
        System.out.println("Diesel engine has started");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Diesel engine has stopped");
    }

    @Override
    protected void accelerateInternal(int level) {
        System.out.println("Diesel engine is accelerating");
    }

    @Override
    public void check() {
        System.out.println("Engine is ok");
    }
}
