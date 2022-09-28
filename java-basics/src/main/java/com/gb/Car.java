package com.gb;

public class Car extends Base {

    private String modelName = "Mustang";

    private String brand = "Ford";
    private Door door1;
    private Door door2;
    private Door door3;
    private Door door4;

    private AirConditioning airConditioning;

    public Car() {
        door1 = new Door();
        door2 = new Door();
        door3 = new Door();
        door4 = new Door();
        airConditioning = new AirConditioning();
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

    public void unlockAllDoors() {
        this.unlockDoor(1);
        this.unlockDoor(2);
        this.unlockDoor(3);
        this.unlockDoor(4);
    }

    public String getModelName() {
        return modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void getInCar(String person, int doorNumber) {
        System.out.printf("%s gets in the car...%n", person);
        this.openDoor(doorNumber);
        this.closeDoor(doorNumber);
    }

    public void getOutCar(String person, int doorNumber) {
        System.out.printf("%s gets out the car...%n", person);
        this.openDoor(doorNumber);
        this.closeDoor(doorNumber);
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
            System.out.println("Air conditioning is already turned off");
        }
        else {
            this.airConditioning.turnOff();
            System.out.println("Air conditioning was turned off");
        }
    }

}
