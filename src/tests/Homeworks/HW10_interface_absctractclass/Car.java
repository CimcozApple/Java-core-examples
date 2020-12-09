package tests.HW10_interface_absctractclass;

public class Car extends Vehicle implements GPS, Radio {

    static String carType;
    static String transmission;

    //from Vehicle

    @Override
    public void gas() {
        System.out.println("Cars: Push the gas in Car after get coordinates" );
    }

    @Override
    public void applyBrake() {
        System.out.println("Cars: No reason apply break");
    }

    //from GPS
    @Override
    public void getCoordinates() {
        System.out.println("Cars: Getting new coordinates");
    }

    @Override
    public void getDirection() {
        System.out.println("Cars: get directions on the map for the current trip");
    }

    @Override
    public void updateMap() {
        System.out.println("Cars: A map for your rout is updating");
    }

    // from Radio
    @Override
    public void startRadio() {
        System.out.println("Cars: turn on the Oxford-FM");
    }

    @Override
    public void stopRadio() {
        System.out.println("Cars: turn off the current radio station");
    }

    @Override
    public void volumeUp() {
        System.out.println("Car: make music louder");
    }

    @Override
    public void volumeDown() {
        System.out.println("Car: make music quieter");
    }
}