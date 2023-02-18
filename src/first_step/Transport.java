package first_step;

public class Transport {
    private String color;
    private int year;
    private int weight;
    private boolean isEngineOn = false;

    protected Transport(String color, int year, int weight) {
        this.color = color;
        this.year = year;
        this.weight = weight;
    }

    // запускает двигатель
    protected void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("Двигатель запущен!");
        } else {
            System.out.println("Двигатель уже запущен!");
        }
    }

    // останавливает двигатель
    public void stopEngine() {
        if (!isEngineOn) {
            System.out.println("Двигатель уже остановлен!");
        } else {
            isEngineOn = false;
            System.out.println("Двигатель остановлен!");
        }
    }
}