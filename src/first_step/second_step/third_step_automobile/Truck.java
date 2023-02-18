package first_step.second_step.third_step_automobile;

import first_step.second_step.Automobile;

public class Truck extends Automobile {

    private int cargoCapacity;
    private boolean isBodyOpen;
    public Truck(String color, int year, int weight, int maxSpeed, int numberOfWheels, int enginePower,
                    String fuelType, int cargoCapacity, int numberOfGears) {
        super(color, year, weight, maxSpeed, numberOfWheels, enginePower, fuelType, numberOfGears);
        this.cargoCapacity = cargoCapacity;
    }

    // открыть кузов
    public void openTrunk() {
        if (!isBodyOpen) {
            isBodyOpen = true;
            System.out.println("Двигатель запущен!");
        } else {
            System.out.println("Двигатель уже запущен!");
        }
    }

    // закрыть кузов
    public void closeTrunk() {
        if (!isBodyOpen) {
            System.out.println("Двигатель уже остановлен!");
        } else {
            isBodyOpen = false;
            System.out.println("Двигатель остановлен!");
        }
    }
}
