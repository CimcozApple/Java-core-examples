package tests.Lessons.lesson13;

//Create 2 ArrayLists, add 3 elements for each of them. Create 3rd ArrayList, add first 2 ArrayLists to it

import java.util.ArrayList;
import java.util.List;

public class task2_ArrayList {

    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();

        list1.add("e");
        list1.add("k");
        list1.add("S");
        list2.add(234);
        list2.add(6);
        list2.add(90);

        System.out.println("List 1 = " + list1);
        System.out.println("List 2 = " + list2);

        List list3 = new ArrayList();
        System.out.println("List 3 = " + list3);
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("List 3 (new)= " + list3);
    }
}
