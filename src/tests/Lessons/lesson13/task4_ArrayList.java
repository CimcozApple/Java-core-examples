package tests.Lessons.lesson13;
//Create ArrayList and add few elements. Print it before nad after sorting. Use String eleents first, then Integer.
//Then print elements in reversed order

import java.util.ArrayList;
import java.util.Collections;

public class task4_ArrayList {

    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("USA");
        arrayList.add("Ukraine");
        arrayList.add("Denmark");
        arrayList.add("Norway");
        arrayList.add("Brazil");
        System.out.println("Before sorting: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("After reversed sorting" + arrayList);

    }
}
