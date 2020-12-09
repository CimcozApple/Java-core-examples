package L3;

public class IfSt2 {
    public static void main(String[] args) {
        int number = -15;

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0 && number > -10) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is 0");
        }
    }
}
