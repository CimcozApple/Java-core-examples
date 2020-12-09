package tests.HW10_interface_absctractclass.classExamples;

public class StaticClass {

    private static void watchTv() {
        System.out.println("outer: Watch a movie");
    }

    static class ChangeChannel {

        public static void main(String[] args) {
            System.out.println("inner: Change a channel");
            watchTv();
        }
    }
}
