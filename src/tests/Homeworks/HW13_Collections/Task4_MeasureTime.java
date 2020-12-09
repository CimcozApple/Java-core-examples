package tests.HW13_Collections;
//Write a program which measure time of inserting of new entry to hashmap and treemap,
// use different amounts of new entries (100, 1000, 10000, 1000000…)

import java.util.*;

public class Task4_MeasureTime {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap();

        System.out.println("Insert in HashMap took: " + getTimeMsOfInsert(hashMap) + " ms");
        System.out.println("Insert in TreeMap took: " + getTimeMsOfInsert(treeMap) + " ms");
    }

    private static long getTimeMsOfInsert(Map<Integer, Integer> map) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            map.put(i, i*10);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
