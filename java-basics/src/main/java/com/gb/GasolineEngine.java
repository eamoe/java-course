package com.gb;

public class GasolineEngine extends Engine {
    @Override
    protected void startInternal() {
        System.out.println("Gasoline engine has started");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Gasoline engine has stopped");
    }

    @Override
    protected void accelerateInternal(int level) {
        System.out.println("Gasoline engine is accelerating");
    }


    @Override
    public void check() {
        System.out.println("Engine is ok");
    }
}
