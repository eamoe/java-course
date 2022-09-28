package com.gb;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private SteeringWheel steeringWheel;

    public Base() {
        engine = new Engine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new Transmission();
        steeringWheel = new SteeringWheel();
    }

    public void start() {
        this.engine.start();
    }

    public void drive (Movement direction) {
        if (engine.getIsRunning()) {
            switch (direction) {
                case FORWARD:
                    transmission.switchGear(1);
                    wheel1.rotate();
                    wheel2.rotate();
                    wheel3.rotate();
                    wheel4.rotate();
                    break;
                case BACKWARD:
                    transmission.switchGear(-1);
                    wheel1.rotate();
                    wheel2.rotate();
                    wheel3.rotate();
                    wheel4.rotate();
                    break;
                case NEUTRAL:
                    transmission.switchGear(0);
                    break;
            }
        }
    }

    public void stop() {
        this.engine.stop();
    }

    public void turnLeft() {
        this.steeringWheel.turnLeft();
        this.wheel1.turnLeft();
        this.wheel2.turnLeft();
    }

    public void turnRight() {
        this.steeringWheel.turnRight();
        this.wheel1.turnRight();
        this.wheel2.turnRight();
    }

    public void moveStraight() {
        this.steeringWheel.moveStraight();
        this.wheel1.moveStraight();
        this.wheel2.moveStraight();
    }

    public boolean isEngineRunning() {
        return this.engine.getIsRunning();
    }

}
