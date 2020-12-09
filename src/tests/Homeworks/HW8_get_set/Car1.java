package tests.HW8_get_set;

public class Car1 {

    private int speed = 150;
    private String type = "data is absent";
    private String fuel = "data is absent";

    public Car1() {
        speed = 180;
        type = "sedan";
        fuel = "gas";
    }

    public Car1(int speed) {
        this.speed = speed;
    }

    public Car1(String fuel, String type) {
        this.fuel = fuel;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car { " +
                "speed = '" + speed + '\'' +
                ", fuel = " + fuel +
                ", type = '" + type +
                '}';
    }
}
