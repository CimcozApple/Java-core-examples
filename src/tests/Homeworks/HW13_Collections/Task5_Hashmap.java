package tests.HW13_Collections;
// Create HashMap with 3 user defined objects Employee (id, name, city). Employee is separate class with described fields
// and overriden toString(), equals() and hashcode() methods. Compare these 3 objects of Employee as values of maps
// (they need to have different keys)
import java.util.HashMap;
import java.util.Map;

public class Task5_Hashmap {
    public static void main(String[] args) {
        Object a = new Object();

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(12, new Employee(1, "Smith", "Denver"));
        employeeMap.put(345, new Employee(46, "Cooper", "New York"));
        employeeMap.put(347, new Employee(15, "Bradly", "Chicago"));
        employeeMap.put(1016, new Employee(1, "Smith", "Denver"));

        System.out.println("==== First variant using map.get(key)===");
        System.out.println("is equal? " + employeeMap.get(12).equals(employeeMap.get(345)));
        System.out.println("is equal? " + employeeMap.get(345).equals(employeeMap.get(347)));
        System.out.println("is equal? " + employeeMap.get(347).equals(employeeMap.get(1016)));
        System.out.println("is equal? " + employeeMap.get(12).equals(employeeMap.get(1016)));

        System.out.println("\n==== Second variant using entry, no need enter a key manually ===");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
            boolean isEqual = true;
            for (Map.Entry<Integer, Employee> entry1 : employeeMap.entrySet()) {
                if (!entry.getKey().equals(entry1.getKey())) {

                    if (entry.getValue().equals(entry1.getValue())) {
                        System.out.println("Value of this Employee's object in map is already present? "  + isEqual);
                    }
                    if (employeeMap.isEmpty()) {
                        System.out.println("no map");
                    }
                }
            }
        }
    }
}