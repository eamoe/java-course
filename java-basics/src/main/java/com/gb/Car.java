package com.gb;

public class Car extends Base {

    private final String modelName;
    private final String brand;

    public Car(String brand, String modelName) {
        this.brand = brand;
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void getInCar(String person, int doorNumber) {
        String message = String.format("%s gets in the car...%n", person);
        System.out.printf(message.toUpperCase());
        this.openDoor(doorNumber);
        this.closeDoor(doorNumber);
    }

    public void getOutCar(String person, int doorNumber) {
        String message = String.format("%s gets out the car...%n", person);
        System.out.printf(message.toUpperCase());
        this.openDoor(doorNumber);
        this.closeDoor(doorNumber);
    }

    public void park() {
        System.out.println("Parking the car...".toUpperCase());
        this.lockAllDoors();
        if (!checkParkables()) {
            System.out.println("The car cannot be parked. Please fix the issues");
        }
        else {
            System.out.println("The car was parked successfully!");
        }
    }

}
