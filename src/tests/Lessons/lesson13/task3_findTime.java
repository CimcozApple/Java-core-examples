package tests.Lessons.lesson13;
//Create program which compare time of adding elements to ArrayList and LinkedList,
//add elements to the end of list and to the first place

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task3_findTime {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList<>()));
        System.out.println(getTimeMsOfInsert(new LinkedList<>()));
    }

    private static long getTimeMsOfInsert(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());    //index mean where add element: index = 0 is start. Without index = at the end f list
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
