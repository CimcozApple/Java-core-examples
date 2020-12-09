package tests.HW13_Collections;
//Write a method switchPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.
// Your method should switch the order of the first two values, then switch the order of the next two,
// switch the order of the next two, and so on.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3_SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));

        SwitchPairs(arrayList1);
        System.out.println("New Array list 1: " + arrayList1);

        SwitchPairs(arrayList2);
        System.out.println("New Array list 2: " + arrayList2);
    }

    public static void SwitchPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            if (i + 1 < list.size())
                Collections.swap(list, i, (i + 1));
        }
    }
}
