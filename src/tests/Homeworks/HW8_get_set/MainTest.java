package tests.HW8_get_set;

public class MainTest {
    public static void main(String[] args) {

        // task 1
        WorkerTest worker1 = new WorkerTest();
        System.out.println("Worker 1: " + worker1.getName() + ", " + worker1.getAge() + ", " + worker1.getPosition() +
                ", " + worker1.getSalary());

        WorkerTest worker2 = new WorkerTest();
        worker2.setName("Mike");
        worker2.setAge(24);
        worker2.setPosition("Java developer");
        worker2.setSalary(3_000);
        System.out.println(worker2);

        WorkerTest worker3 = new WorkerTest();
        System.out.println(worker3);

        // task 2
        WorkerTest worker4 = new WorkerTest();
        System.out.println(worker4.toString());
        System.out.println();

    }
}