package com.gb;

public abstract class Engine implements Checkable {
    private Boolean isRunning;

    public Engine() {
        this.isRunning = false;
    }

    public void start () {
        this.isRunning = true;
        System.out.println("Engine is starting...".toUpperCase());
        startInternal();
    }

    public void stop () {
        this.isRunning = false;
        System.out.println("Engine is stopping...".toUpperCase());
        stopInternal();
    }

    public void accelerate(int level) {
        if (this.isRunning) {
            System.out.printf("Accelerated to %d%n".toUpperCase(), level);
            accelerateInternal(level);
        }
    }

    public Boolean getIsRunning() {
        return isRunning;
    }

    protected abstract void startInternal();
    protected abstract void stopInternal();
    protected abstract void accelerateInternal(int level);

}
