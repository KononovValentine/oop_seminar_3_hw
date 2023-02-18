package first_step.second_step.third_step_aviation;

import first_step.second_step.Aviation;

public class Plane extends Aviation {

    private int wingspan;

    public Plane(String color, int year, int weight, int maxFlightAltitude, int maxVerticalSpeed,
                    int maxHorizontalSpeed, int numberOfEngines, int wingspan) {
        super(color, year, weight, maxFlightAltitude, maxVerticalSpeed, maxHorizontalSpeed, numberOfEngines);
        this.wingspan = wingspan;
    }

    public void requestALandingLane(int lane) {
        if (this.isInFlight) {
            System.out.println("Запрашиваю разрешение на посадку на полосу " + lane);
            this.isInFlight = false;
            System.out.println("Посадка!");
        } else {
            System.out.println("Запрашиваю разрешение на взлет с полосы " + lane);
            this.isInFlight = true;
            System.out.println("Взлет!");
        }
    }
}
