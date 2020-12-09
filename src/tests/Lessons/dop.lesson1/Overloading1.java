package L5;

public class Overloading1 {
    public static void main(String[] args) {
        int myNum1 = plusInt(5, 5);
        double myNum2 = plusDouble(1.2, 5.3);

        int myNum3 = plusMethod(5, 5);
        double myNum4 = plusMethod(1.2, 5.3);

        System.out.println("int: " + myNum1);
        System.out.println("double " + myNum2);

        System.out.println("int: " + myNum3);
        System.out.println("double " + myNum4);
    }

    public static int plusInt(int x, int y) {
        return x + y;
    }

    public static double plusDouble(double x, double y) {
        return x + y;
    }

    public static int plusMethod(int x, int y) {
        return x + y;
    }

    public static double plusMethod(double x, double y) {
        return x + y;
    }
}
