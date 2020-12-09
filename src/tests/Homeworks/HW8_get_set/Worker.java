package tests.HW8_get_set;

public class Worker {

    private String name;
    private int age;
    private String position;
    private int salary;

    Worker() {
        name = "First name";
        age = 30;
        position = "Department head";
        salary = 5000;
    }

    public String getName() {
        return name = "John Doe";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age = 20;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position = "Developer";
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary = 2000;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker { " +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", position = '" + position + '\'' +
                ", salary = " + salary +
                '}';
    }
}
