package tests.HW9_inheritance;

public class RoadBicycle1 extends Bicycle1 {

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
}