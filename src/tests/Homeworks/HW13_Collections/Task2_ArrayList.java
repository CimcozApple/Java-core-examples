package tests.HW13_Collections;
//2. Write a Java program to compare two array lists. Each needs to contains at least 5 elemets

import java.util.ArrayList;
import java.util.Arrays;

public class Task2_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Price", "Name", "Country", "Quality", "Stars"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Price", "Name", "Producer", "Exporter", "Country", "Quality", "End Date"));

        System.out.println("First list " + list1);
        System.out.println("Second list " + list2);

        boolean isEqual = list2.equals(list1);
        System.out.println("List 2 is equal to list 1 - " + isEqual + "\n");    //false

        list2.retainAll(list1);
        System.out.println("Common elements in two lists: " + list2);
    }
}
