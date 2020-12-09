package tests.HW8_get_set;

public class Main {
    public static void main(String[] args) {

        // task 1
        Worker worker1 = new Worker();
        System.out.println("Worker 1: " + worker1.getName() + ", " + worker1.getAge() + ", " + worker1.getPosition() +
                ", " + worker1.getSalary());

        Worker worker2 = new Worker();
        worker2.setName("Mike");
        worker2.setAge(24);
        worker2.setPosition("Java developer");
        worker2.setSalary(3_000);
        System.out.println(worker2);

        Worker worker3 = new Worker();
        System.out.println(worker3);

        // task 2
        Worker worker4 = new Worker();
        System.out.println(worker4.toString());
        System.out.println();

        // task 3
        Dog_static dog = new Dog_static();
        System.out.println("Dog breed = " + dog.getType());
        dog.dogAge(4);
        System.out.println();

        // task 4
        Car1 car3 = new Car1();
        System.out.println(car3);

        Car1 car1 = new Car1(200);
        System.out.println(car1);

        Car1 car2 = new Car1("petrol", "pikap");
        System.out.println(car2);
        System.out.println();

        // task 5.1 first class
        Box box1 = new Box();  // 10, 10
        Box box2 = new Box(10, 10);
        System.out.println("Box 1 equals Box2 -> " + box1.equals(box2));

        //The "==" operator for Box
        int box3 = 15;
        int box4 = 16;
        int box5 = box3;
        boolean c1 = box3 == box4;
        boolean c2 = box3 == box5;
        System.out.println("box3 == box4 ->" + c1);
        System.out.println("box3 == box5 ->" + c2);
        System.out.println();

        //5.2 - second class
        Toys toy1 = new Toys("doll");
        Toys toy2 = new Toys("doll");
        Toys toy3 = toy1;

        System.out.println("toy1 equals toy2 ->" + toy1.equals(toy2));
        System.out.println("toy1 equals toy3 ->" + toy1.equals(toy3));

        //The "==" operator returns true only if the two references pointing to the same object in memory
        String toy4 = "Bear";
        String toy5 = "Bear";
        String toy6 = toy4;

        System.out.println("toy4 equals toy5 -> " + toy4.equals(toy5));
        System.out.println("toy4 equals toy6 -> " + toy4.equals(toy6));

        boolean input1 = toy4 == toy5;
        boolean input2 = toy4 == toy6;
        System.out.println("toy4 == toy5 ->" + input1);
        System.out.println("toy4 == toy6 ->" + input2);
    }
}