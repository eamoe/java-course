/* Основываясь на коде с урока,
придумать ешё один пример использования абстрактного класса и интерфейса. */

package com.gb;

public class Lesson008Task01 {

    public static void main(String[] args) {

        Car car = new Car("Ford", "Mustang");

        System.out.printf("Car brand & model: %s %s%n", car.getBrand(), car.getModelName());

        car.getInCar("Driver", 1);
        car.getInCar("Passenger", 2);

        car.start();

        car.turnOnAirConditioning();

        car.drive(Movement.FORWARD);
        car.turnLeft();
        car.moveStraight();
        car.drive(Movement.NEUTRAL);
        car.drive(Movement.BACKWARD);

        car.turnOffAirConditioning();

        car.stop();

        car.unlockAllDoors();

        car.getOutCar("Driver", 1);
        car.getOutCar("Passenger", 2);

        car.park();
    }

}
