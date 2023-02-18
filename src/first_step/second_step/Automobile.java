package first_step.second_step;

import first_step.Transport;

public class Automobile extends Transport {

    private int maxSpeed;
    private int numberOfWheels;
    private int enginePower;
    private String fuelType;
    private int numberOfGears;
    private int selectGear = 0;
    protected Automobile(String color, int year, int weight, int maxSpeed, int numberOfWheels, int enginePower,
                         String fuelType, int numberOfGears) {
        super(color, year, weight);
        this.maxSpeed = maxSpeed;
        this.numberOfWheels = numberOfWheels;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
        this.numberOfGears = numberOfGears;
    }

    // проверить нейтральную передачу и запустить двигатель
    public void checkNeutralTransmissionAndStart() {
        if (selectGear == 0) {
            this.startEngine();
        } else {
            System.out.println("Выбрана " + selectGear + " передача, завести двигатель невозможно!");
        }
    }

    // сменить передачу
    public void changeGear(int gear) {
        if (gear >= 0 && gear <= numberOfGears) {
            selectGear = gear;
            System.out.println("Выбранная передача установлена!");
        } else if (selectGear == gear) {
            System.out.println("Выбранная передача уже установлена!");
        }
    }
}
