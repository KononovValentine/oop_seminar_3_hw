import first_step.second_step.third_step_automobile.Bus;
import first_step.second_step.third_step_automobile.Car;
import first_step.second_step.third_step_automobile.Truck;
import first_step.second_step.third_step_aviation.Helicopter;
import first_step.second_step.third_step_aviation.Plane;

public class Program {
    public static void main(String[] args) {

        Car car = new Car(
                "Green",
                2015,
                1500,
                200,
                4,
                150,
                "Gasoline",
                6,
                4,
                5
        );

        car.openTrunk();
        car.openTrunk();
        car.changeGear(1);
        car.changeGear(7);
        car.checkNeutralTransmissionAndStart();
        car.changeGear(0);
        car.checkNeutralTransmissionAndStart();
        car.stopEngine();

        Truck truck = new Truck(
                "White",
                2005,
                7000,
                140,
                12,
                220,
                "Diesel",
                24,
                2400
        );

        Bus bus = new Bus(
                "Red",
                1993,
                5000,
                110,
                10,
                174,
                "Gasoline",
                12,
                64);

        Plane plane = new Plane(
                "Red",
                2000,
                11000,
                15500,
                20,
                2300,
                1,
                12);

        Helicopter helicopter = new Helicopter(
                "Blue",
                1995,
                9000,
                5000,
                44,
                900,
                2,
                5);

        System.out.println();
        helicopter.fromTheScrew();
        helicopter.requestHelipad("H3");
        helicopter.requestHelipad("H1");
        helicopter.stopEngine();
    }
}
