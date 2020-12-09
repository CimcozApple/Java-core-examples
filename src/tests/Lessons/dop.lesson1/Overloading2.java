package L5;

public class Overloading2 {
    public static void main(String[] args) {
        byte a = 25;
        Demo1.show('A');

        Demo1 test = new Demo1();
        test.show(a);
        test.show("Text");
        test.show(100);

    }

//    public void testMethod() {
//        Demo1 test = new Demo1();
//        test.show();
//    }
}
