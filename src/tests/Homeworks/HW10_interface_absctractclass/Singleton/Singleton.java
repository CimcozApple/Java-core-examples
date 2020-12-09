package tests.HW10_interface_absctractclass.Singleton;

public class Singleton {

    private static Singleton single_planet;
    public String planet;

    private Singleton(String planet) {
        this.planet = planet;
    }

    public static Singleton getInstance(String planet) {
        if (single_planet == null) {                  //object isn't created yet
            single_planet = new Singleton(planet);    //create new object
        }
        return single_planet;                         // return previously created object
    }
}
