package tests.HW13_Collections;
//Create a List (try both ArrayList and LinkedList) and fill it with 5 countries. Sort the list and print it,
// then apply Collections.shuffle( ) to the list

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("Turkey");
        arrayList.add("Ukraine");
        arrayList.add("Switzerland");
        arrayList.add("Norway");
        arrayList.add("Brazil");
        System.out.println("ArrayList Before sorting " + arrayList);
        Collections.sort(arrayList);
        System.out.println("ArrayList After sorting " + arrayList);
        Collections.shuffle(arrayList);
        System.out.println("ArrayList After suffle " + arrayList + "\n");   //method randomizes the list

        linkedList.addAll(arrayList);
        System.out.println("LinkedList Before sorting " + linkedList);
        Collections.sort(linkedList);
        System.out.println("LinkedList After sorting " + linkedList);
        Collections.shuffle(linkedList);
        System.out.println("LinkedList After suffle " + linkedList);
    }
}
