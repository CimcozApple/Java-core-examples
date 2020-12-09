package tests.HW10_interface_absctractclass.Singleton;

public class SingletonMain {

    public static void main(String[] args) {

        System.out.println("If you see the same value, then singleton works good" + "\n" +
                "If you see different values, then 2 singletons were created (epic fail)" + "\n");
        Singleton singletonOne = Singleton.getInstance("Earth");
        Singleton singletonTwo = Singleton.getInstance("Mars");
        System.out.println("singletonOne = " + singletonOne.planet);
        System.out.println("singletonTwo = " + singletonTwo.planet);
    }
}
