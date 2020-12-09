package tests.HW8_get_set;

public class Dog_static {

static String type;

    public static String getType() {
        type = "poodle";
        return type;
    }

    public static void dogAge (int year) {
        System.out.println("Text in static method: keep calm, dog's age doesn't matter");
    }
}
