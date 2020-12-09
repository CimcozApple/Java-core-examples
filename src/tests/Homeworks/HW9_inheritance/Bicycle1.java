package tests.HW9_inheritance;

public class Bicycle1 extends Vehicle1 {

    public final int id = 1;
    protected int gear;

    public Bicycle1() {
        gear = 5;
    }

    public Bicycle1(final int id, int gear) {
        this.gear = gear;
    }

    public Bicycle1(int gear) {
        this.gear = gear;
    }

    public void changeGear(int value) {
        gear += value;
    }

    public int getId() {
        return id;
    }

    public int getGear() {
        return gear;
    }

    //overridden move method, differ print in console
    public void move() {
     super.move();
        System.out.println("Class Bicycle: bicycle moves");
    }
}