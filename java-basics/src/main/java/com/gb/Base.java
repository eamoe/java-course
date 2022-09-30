package com.gb;

import java.util.*;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private SteeringWheel steeringWheel;
    private Door door1;
    private Door door2;
    private Door door3;
    private Door door4;
    private AirConditioning airConditioning;
    private List<Checkable> checkables;

    public Base() {
        engine = new ElectricEngine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new AutomaticTransmission();
        steeringWheel = new SteeringWheel();
        door1 = new Door();
        door2 = new Door();
        door3 = new Door();
        door4 = new Door();
        airConditioning = new AirConditioning();
        checkables = List.of(
                            engine,
                            wheel1,
                            wheel2,
                            wheel3,
                            wheel4,
                            transmission,
                            steeringWheel,
                            door1,
                            door2,
                            door3,
                            door4,
                            airConditioning);
        }

    public void start() {
        this.checkAll();
        this.engine.start();
    }

    public void drive (Movement direction) {
        if (engine.getIsRunning()) {
            this.lockAllDoors();
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
        return engine.getIsRunning();
    }
    public void openDoor(int doorNumber) {
        switch (doorNumber) {
            case 1:
                System.out.println("Door # 1");
                if (door1.isLocked()) {
                    System.out.println("The door is locked. To open the door, please unlock it first.");
                }
                else {
                    door1.open();
                }
                break;
            case 2:
                System.out.println("Door # 2");
                if (door2.isLocked()) {
                    System.out.println("The door is locked. To open the door, please unlock it first.");
                }
                else {
                    door2.open();
                }
                break;
            case 3:
                System.out.println("Door # 3");
                if (door3.isLocked()) {
                    System.out.println("The door is locked. To open the door, please unlock it first.");
                }
                else {
                    door3.open();
                }
                break;
            case 4:
                System.out.println("Door # 4");
                if (door4.isLocked()) {
                    System.out.println("The door is locked. To open the door, please unlock it first.");
                }
                else {
                    door4.open();
                }
                break;
            default:
                System.out.println("Incorrect door number!");
        }
    }

    public void closeDoor(int doorNumber) {
        switch (doorNumber) {
            case 1:
                System.out.println("Door # 1");
                door1.close();
                break;
            case 2:
                System.out.println("Door # 2");
                door2.close();
                break;
            case 3:
                System.out.println("Door # 3");
                door3.close();
                break;
            case 4:
                System.out.println("Door # 4");
                door4.close();
                break;
            default:
                System.out.println("Incorrect door number!");
        }
    }

    public void lockDoor(int doorNumber) {
        switch (doorNumber) {
            case 1:
                System.out.println("Door # 1");
                door1.lock();
                break;
            case 2:
                System.out.println("Door # 2");
                door2.lock();
                break;
            case 3:
                System.out.println("Door # 3");
                door3.lock();
                break;
            case 4:
                System.out.println("Door # 4");
                door4.lock();
                break;
            default:
                System.out.println("Incorrect door number!");
        }
    }

    public void lockAllDoors() {
        this.lockDoor(1);
        this.lockDoor(2);
        this.lockDoor(3);
        this.lockDoor(4);
    }

    public void unlockDoor(int doorNumber) {
        switch (doorNumber) {
            case 1:
                System.out.println("Door # 1");
                door1.unlock();
                break;
            case 2:
                System.out.println("Door # 2");
                door2.unlock();
                break;
            case 3:
                System.out.println("Door # 3");
                door3.unlock();
                break;
            case 4:
                System.out.println("Door # 4");
                door4.unlock();
                break;
            default:
                System.out.println("Incorrect door number!");
        }
    }
    public void turnOnAirConditioning() {
        if (!this.isEngineRunning()) {
            System.out.println("Cannot turn air conditioning on. The engine is not running!");
        }
        else {
            this.airConditioning.turnOn();
            System.out.println("Air conditioning was turned on");
        }
    }

    public void turnOffAirConditioning() {
        if (!this.isEngineRunning()) {
            System.out.println("Air conditioning has already been turned off");
        }
        else {
            this.airConditioning.turnOff();
            System.out.println("Air conditioning was turned off");
        }
    }

    public void unlockAllDoors() {
        this.unlockDoor(1);
        this.unlockDoor(2);
        this.unlockDoor(3);
        this.unlockDoor(4);
    }

    public void checkAll() {
        ListIterator<Checkable> it = checkables.listIterator();
        Checkable checkable;
        while(it.hasNext()) {
            checkable = it.next();
            checkable.check();
        }
    }

}
