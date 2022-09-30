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
        System.out.printf("%s gets in the car...%n", person);
        this.openDoor(doorNumber);
        this.closeDoor(doorNumber);
    }

    public void getOutCar(String person, int doorNumber) {
        System.out.printf("%s gets out the car...%n", person);
        this.openDoor(doorNumber);
        this.closeDoor(doorNumber);
    }

}
