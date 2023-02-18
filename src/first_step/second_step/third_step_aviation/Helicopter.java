package first_step.second_step.third_step_aviation;

import first_step.second_step.Aviation;

public class Helicopter extends Aviation {

    private int bladesSpan;
    public Helicopter(String color, int year, int weight, int maxFlightAltitude, int maxVerticalSpeed,
                         int maxHorizontalSpeed, int numberOfEngines, int bladesSpan) {
        super(color, year, weight, maxFlightAltitude, maxVerticalSpeed, maxHorizontalSpeed, numberOfEngines);
        this.bladesSpan = bladesSpan;
    }

    // запрашивает взлетно посадочную площадку
    public void requestHelipad(String helipad) {
        if (this.isInFlight) {
            System.out.println("Запрашиваю разрешение на посадку. Площадка " + helipad);
            this.isInFlight = false;
            System.out.println("Посадка!");
        } else {
            System.out.println("Запрашиваю разрешение на взлет с площадки " + helipad);
            this.isInFlight = true;
            System.out.println("Взлет!");
        }
    }
}
