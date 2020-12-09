package L3;

public class IfSt3 {
    public static void main(String[] args) {
        String userName = "Paul";
        int age = 15;
        if (age >= 18) {
            if (userName.equals("John")) {
                System.out.println("Hello John");
            } else if (userName.equals("Anna")) {
                System.out.println("Hello Anna");
            } else {
                System.out.println("Hello unknown user!");
            }
        } else {
            System.out.println("Access denied!");
        }
        //s
    }
}
