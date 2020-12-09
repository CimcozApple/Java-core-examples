package tests.HW10_interface_absctractclass;

public interface GPS {

    void getCoordinates();

    void getDirection();

    default void updateMap() {
        System.out.println("GPS: Installing the last update for all maps");
        ;
    }

    static void changeVoice() {
        System.out.println("GPS: Please, select one of the three voices from the system");
        ;
    }
}
