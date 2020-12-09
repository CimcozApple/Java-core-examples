package tests.HW10_interface_absctractclass.classExamples;

public class Anonymous2 {

    public static void main(String[] args) {

        Age adult = new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is: " + age);
            }
        };
        adult.getAge();
    }
}

interface Age {
    int age = 21;

    void getAge();
}