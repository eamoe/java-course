package com.gb;

public class Engine {
    private Boolean isRunning;

    public Engine() {
        this.isRunning = false;
    }

    public void start () {
        this.isRunning = true;
        System.out.println("Engine started");
    }

    public void stop () {
        this.isRunning = false;
        System.out.println("Engine stopped");
    }

    public void accelerate(int level) {
        if (this.isRunning) {
            System.out.printf("Accelerated to %d%n", level);
        }
    }

    public Boolean getIsRunning() {
        return isRunning;
    }

}
