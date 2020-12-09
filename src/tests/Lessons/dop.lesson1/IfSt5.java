package L3;

public class IfSt5 {
    public static void main(String[] args) {

        // 1
//        int a1 = 100;
//        int b2 = 2;
//        int temp = b2;
//        b2 = a1;
//        a1 = temp;
//        System.out.println(a1 + " " + b2);

        // 2
        int a = 100;
        int b = 2;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
