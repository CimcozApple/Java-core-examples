package tests.HW10_interface_absctractclass;

public class MountainBicycle extends Bicycle {

    private int seatHeight = 61;

    public void setSeatHeight(int value) {
        this.seatHeight = value;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    @Override
    public void changeGear() {
        gear = 7;
    }
}
