/* Основываясь на коде с урока,
придумать ешё один пример использования абстрактного класса и интерфейса. */

package com.gb;

public class Lesson008Task01 {

    public static void main(String[] args) {
        Car car = new Car("Mustang", "Ford");
        System.out.printf("Car brand: %s%nCar model: %s%n", car.getBrand(), car.getModelName());
        car.getInCar("Driver", 1);
        car.getInCar("Passenger", 2);
        car.turnOnAirConditioning();
        car.start();
        car.turnOnAirConditioning();
        car.lockAllDoors();
        car.drive(Movement.FORWARD);
        car.turnLeft();
        car.moveStraight();
        car.drive(Movement.NEUTRAL);
        car.drive(Movement.BACKWARD);
        car.turnOffAirConditioning();
        car.stop();
        car.turnRight();
        car.moveStraight();
        car.unlockAllDoors();
        car.getOutCar("Driver", 1);
        car.getOutCar("Passenger", 1);
    }

}
