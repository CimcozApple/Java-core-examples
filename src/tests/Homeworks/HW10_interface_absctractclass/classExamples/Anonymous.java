package tests.HW10_interface_absctractclass.classExamples;

public class Anonymous {

    void giveName() {
        System.out.println("Give a name for newly opened star");
    }
}

    class Stars {
        static Anonymous star = new Anonymous() {
            public void giveName() {
                super.giveName();
                System.out.println("Give a name to the star");
            }
        };

    public static void main(String[] args) {
        star.giveName();
    }
}

