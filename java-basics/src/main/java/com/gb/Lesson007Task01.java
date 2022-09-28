// 1. Основываясь на примере с урока продолжить развивать систему классов,
// описывающих структуру и функционирование легкового автомобиля.
// Добавить сам класс автомобиля, который будет включать созданную нами базу.
// Помимо базы добавить такие компоненты, как двери, кондиционер, рулевое управление и др.
// Наладить их взаимодействие.
//2***. Поискать места в которых можно было бы использовать абстрактные классы и наследование

package com.gb;

public class Lesson007Task01 {

    public static void main(String[] args) {

        Car car = new Car();
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
