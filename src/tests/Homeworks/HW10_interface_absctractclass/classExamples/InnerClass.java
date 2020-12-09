package tests.HW10_interface_absctractclass.classExamples;

public class InnerClass {

    void showFirstValue() {
        int x = 100;
        System.out.println("First Value is " + x);

        class InsideInner {

            void showSecondValue() {
                int y = 200;
                System.out.println("Second Value is " + y);
            }
        }

        InsideInner value = new InsideInner();
        value.showSecondValue();
    }
}
