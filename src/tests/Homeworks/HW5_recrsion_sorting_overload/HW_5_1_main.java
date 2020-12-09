package tests.HW5_recrsion_sorting_overload;

//Write program with example of overloading with methods with variations of parameters: (int), (int, int), (double, int),
// (int, double), (int, float, String) and without parameters.

public class HW_5_1_main {
    public static void main(String[] args) {

     OverloadingClass counter = new OverloadingClass();

        System.out.println(counter.add(5555));                                      // int
        System.out.println(counter.add(1, 13));                                     // int, int = a + b
        System.out.println(counter.add(3.45555, 10));                               // double, int = a + b + 10
        System.out.println(counter.add(6, 9.99));                                   // int, double = 2*a + 2*b
        System.out.println(counter.add(4,5.99f, "Sale price")); // int, float, String = a+b
        System.out.println(counter.add());
    }
}
