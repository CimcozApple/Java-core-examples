package tests.Lessons.lesson13;
//Create Hashmap with user defined object Employee (id, name, city)

import java.util.HashMap;
import java.util.Map;

public class task8_Hashmap {
    public static void main(String[] args) {
        Map<Integer, task8_Employee> employeeMap = new HashMap<>();

        employeeMap.put(12, new task8_Employee(1001, "Smith", "Denver"));
        employeeMap.put(345, new task8_Employee(1002, "Cooper", "New York"));
        employeeMap.put(268, new task8_Employee(1003, "Brradly", "Chicago"));

        System.out.println(employeeMap);
    }
}
