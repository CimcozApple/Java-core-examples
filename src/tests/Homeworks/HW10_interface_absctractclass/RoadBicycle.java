package tests.HW10_interface_absctractclass;

public class RoadBicycle extends Bicycle{

    private int rudderDepth = 30;

    public void setRudderDepth(int value) {
        this.rudderDepth = value;
    }

    int getRudderDepth() {
        return rudderDepth;
    }

    void RoadBicycle (int rudderDepth) {
        this.rudderDepth = rudderDepth;
    }

    @Override
    public void applyBrake(){
        System.out.println("RoadBicycle: Use specific break method in this situation.");
    }

    @Override
    public void move() {
        System.out.println("RoadBicycle: moves slower than mountain bicycle");
    }

    @Override
    public void changeGear() {
        gear = 3;
    }
}