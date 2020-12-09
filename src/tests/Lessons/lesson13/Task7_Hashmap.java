package tests.Lessons.lesson13;
//Use as much as possible ways to iterate over Hashmap

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task7_Hashmap {
    public static void main(String[] args) {
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.putIfAbsent("David", 76000.00);
        employeeSalary.putIfAbsent("Steven", 120000.00);
        employeeSalary.putIfAbsent("John", 134000.00);
        employeeSalary.putIfAbsent("Mark", 95000.00);

        employeeSalary.forEach((name, salary) -> System.out.println(name + " => " + salary));
        System.out.println();

        System.out.println("\n=== Iterating over the HashMap's EntrySet using iterator() ===");
        Set<Map.Entry<String, Double>> employeeSalaryEntries = employeeSalary.entrySet();
        Iterator<Map.Entry<String, Double>> employeeSalaryIterator = employeeSalaryEntries.iterator();
        while (employeeSalaryIterator.hasNext()) {
            Map.Entry<String, Double> entry = employeeSalaryIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n=== Iterating over the HashMap's EntrySet using Java8 ForEach and lambda ===");
        employeeSalary.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });

        System.out.println("\n=== Iterating over the HashMap's EntrySet using simple ForEach loop ===");
        for (Map.Entry<String, Double> entry : employeeSalary.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }        ;

        System.out.println("\n=== Iterating over the HashMap's keySet ===");
        employeeSalary.keySet().forEach(employee -> {
            System.out.println(employee + " => " + employeeSalary.get(employee));
        });

    }
}