package first_step.second_step.third_step_automobile;

import first_step.second_step.Automobile;

public class Car extends Automobile {

    private int numberOfDoors;
    private int numberOfSeats;
    private boolean isTrunkOpen = false;

    public Car(String color, int year, int weight, int maxSpeed, int numberOfWheels, int enginePower,
                  String fuelType, int numberOfDoors, int numberOfSeats, int numberOfGears) {
        super(color, year, weight, maxSpeed, numberOfWheels, enginePower, fuelType, numberOfGears);
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
    }

    // открыть багажник
    public void openTrunk() {
        if (!isTrunkOpen) {
            isTrunkOpen = true;
            System.out.println("Двигатель запущен!");
        } else {
            System.out.println("Двигатель уже запущен!");
        }
    }

    // закрыть багажник
    public void closeTrunk() {
        if (!isTrunkOpen) {
            System.out.println("Двигатель уже остановлен!");
        } else {
            isTrunkOpen = false;
            System.out.println("Двигатель остановлен!");
        }
    }
}
