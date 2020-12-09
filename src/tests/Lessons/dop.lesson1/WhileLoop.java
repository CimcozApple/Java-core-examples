package L4;

public class WhileLoop {
    public static void main(String[] args) {
        boolean isStarted = true;

        while (isStarted) {
            System.out.println("Hello");
            if (false) {
                isStarted = false;
            }
        }

    }
}
