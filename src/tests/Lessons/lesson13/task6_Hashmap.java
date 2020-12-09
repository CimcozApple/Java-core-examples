package tests.Lessons.lesson13;
//Create Hashmap, add some key and value, use as much methods as possible

import java.util.HashMap;
import java.util.Map;

public class task6_Hashmap {
    public static void main(String[] args) {
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("One", 1);
        numberMap.put("Two", 2);
        numberMap.put("Three", 3);
        numberMap.put("Two", 22);   // 22 will be shown, not 2.
        numberMap.putIfAbsent("five", 25);    // "five" - key, 5 - value
        System.out.println(numberMap);

        System.out.println(numberMap.size());
        System.out.println(numberMap.entrySet());
        System.out.println(numberMap.values());
        System.out.println(numberMap.containsKey("One")); //boolean
        System.out.println(numberMap.containsValue(22));  //boolean
        System.out.println(numberMap.isEmpty());          //boolean
        System.out.println(numberMap.replace("Five", 235));

        System.out.println(numberMap);
    }
}
