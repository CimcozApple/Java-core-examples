package tests.Lessons;

public class Lesson12_nested_try_catch {

    public static void main(String[] args) {
        String[] s = {"cat", "dog"};

        try {
            System.out.println(s[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
            try {
                int r = 3 / 0;
            } catch (ArithmeticException e1) {
                System.out.println("Exception thrown: " + e1);
            }
        }
    }
}
