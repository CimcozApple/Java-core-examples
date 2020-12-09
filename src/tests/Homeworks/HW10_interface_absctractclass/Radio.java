package tests.HW10_interface_absctractclass;

public interface Radio {

    void startRadio();
    void volumeUp();
    void volumeDown();

    default void stopRadio(){
        System.out.println("Radio: Stop playing this music");
    };

    static void changeStation() {
        System.out.println("Radio: Search another radio-station");
    }
}
