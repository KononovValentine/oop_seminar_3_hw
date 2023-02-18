package first_step.second_step.third_step_automobile;

import first_step.second_step.Automobile;

public class Bus extends Automobile {

    private int passengerCapacity;
    private int numberOfPassengersPerTrip = 0;

    public Bus(String color, int year, int weight, int maxSpeed, int numberOfWheels, int enginePower,
                  String fuelType, int passengerCapacity, int numberOfGears) {
        super(color, year, weight, maxSpeed, numberOfWheels, enginePower, fuelType, numberOfGears);
        this.passengerCapacity = passengerCapacity;
    }

    // добавляет в переменную учета вошедших пассажиров за текущий рейс
    public void registerIncomingPassengers(int number) {
        numberOfPassengersPerTrip += number;
    }
}
