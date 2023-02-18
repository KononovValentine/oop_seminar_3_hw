package first_step.second_step;

import first_step.Transport;

public class Aviation extends Transport {

    private int maxFlightAltitude;
    private int maxVerticalSpeed;
    private int maxHorizontalSpeed;
    private int numberOfEngines;
    protected boolean isInFlight = false;
    protected Aviation(String color, int year, int weight, int maxFlightAltitude, int maxVerticalSpeed,
                       int maxHorizontalSpeed, int numberOfEngines) {
        super(color, year, weight);
        this.maxFlightAltitude = maxFlightAltitude;
        this.maxVerticalSpeed = maxVerticalSpeed;
        this.maxHorizontalSpeed = maxHorizontalSpeed;
        this.numberOfEngines = numberOfEngines;
    }

    // Дать команду "от винта" и запустить двигатель
    public void fromTheScrew() {
        System.out.println("От винта!");
        this.startEngine();
    }
}
