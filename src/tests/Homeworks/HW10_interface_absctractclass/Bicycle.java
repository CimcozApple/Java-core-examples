package tests.HW10_interface_absctractclass;

public abstract class Bicycle extends Vehicle {

    public final int id = 13;
    protected int gear;

    public Bicycle() {
        gear = 5;
    }

    public abstract void changeGear();

    public Bicycle(final int id, int gear) {
        this.gear = gear;
    }

    public Bicycle(int gear) {
        this.gear = gear;
    }

    @Override
    public void move() {
     super.move();
        System.out.println("Bicycle: bicycle moves good in the town");
    }
    @Override
    public void gas(){
        System.out.println("Bicycle: this transport doesn't have this specific element.");
    }

    @Override
    public void applyBrake(){
        gear -= 100;
        System.out.println("Bicycle: Stop the bicycle if value = " + gear);
    }
}