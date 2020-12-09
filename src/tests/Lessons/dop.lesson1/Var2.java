package L2;

public class Var2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        boolean result;
//        result = a == b;
//        result = a != b;
        result = a >= b || a <= b && a == b;


        System.out.println(result);

        double c = 5.02;
        System.out.println((int)c);
        a += 5; // a = a + 5
        a -= a + b; // a = a - (a + b)
    }
}
