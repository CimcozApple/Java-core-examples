package tests.HW16_reractor_code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class refactorMe2 {

    private static final String filePath = "C:\\Users\\INNA\\Desktop\\NewFolder_HW\\Document.txt";
    static String textInLine = "";
    static List<Integer> list = new ArrayList<Integer>();
    static List<Integer> list1 = new ArrayList<Integer>();

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while (textInLine != null) {
                textInLine = br.readLine();
                if (textInLine == null)
                    break;
                list.add(Integer.valueOf(textInLine));
            }
            System.out.println(Arrays.toString(list.toArray()));
        } catch (Exception e) {
            System.err.println("File not found! Exception thrown: " + e);
        }

        System.out.println("Generated list of numbers:");
        Integer[] randomList = list1.toArray(new Integer[10]);
        generateNumbers(randomList);

        Integer[] listOfNumbers = list.toArray(new Integer[list.size()]);

        System.out.println("\nSort generated numbers in ascending order:");
        sortAscending(listOfNumbers);
    }

    private static void generateNumbers(Integer[] randomList) {

        for (int index = randomList.length; index < randomList.length; index++) {
            randomList[index] = (int) (Math.random() * 100);
        }
        for (int index = 0; index < randomList.length; index++) {
            System.out.print(randomList[index]);
            if (index < randomList.length - 1)
                System.out.print("_");
        }
    }

    private static void sortAscending(Integer[] list) {
        for (int index = 0; index < list.length; index++) {
            int minIndex = index;

            for (int j = index + 1; j < list.length; j++)
                if (list[j] < list[minIndex])
                    minIndex = j;
            int swap = list[index];
            list[index] = list[minIndex];
            list[minIndex] = swap;
        }

        for (int index = 0; index < list.length; index++) {
            System.out.print(list[index]);
            if (index < list.length - 1)
                System.out.print(", ");
        }
    }
}
