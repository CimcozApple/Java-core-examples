package tests.HW16_reractor_code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RefactorMe1 {

    private static final String filePath = "C:\\Users\\INNA\\Desktop\\NewFolder_HW\\Document.txt";
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        List<String> listFromFile = readFromFile(filePath);
        System.out.println(listFromFile);

        int expandSize = 10;
        Integer[] listOfNumbers = list.toArray(new Integer[expandSize]);
        System.out.println("Generated list of numbers: ");
        generateNumbers(listOfNumbers);

        System.out.println("\nSort generated numbers in ascending order:");
        sortAscending(listOfNumbers);
    }

    private static void generateNumbers(Integer[] randomList) {

        for (int numberIndex = 0; numberIndex < randomList.length; numberIndex++) {
            randomList[numberIndex] = (int) (Math.random() * 100);
        }
        for (int numberIndex = 0; numberIndex < randomList.length; numberIndex++) {
            System.out.print(randomList[numberIndex]);
            if (numberIndex < randomList.length - 1)
                System.out.print("_");
        }
    }

    private static void sortAscending(Integer[] list) {
        for (int numberIndex = 0; numberIndex < list.length; numberIndex++) {
            int minIndex = numberIndex;

            for (int j = numberIndex + 1; j < list.length; j++)
                if (list[j] < list[minIndex])
                    minIndex = j;
            int swap = list[numberIndex];
            list[numberIndex] = list[minIndex];
            list[minIndex] = swap;
        }

        for (int numberIndex = 0; numberIndex < list.length; numberIndex++) {
            System.out.print(list[numberIndex]);
            if (numberIndex < list.length - 1)
                System.out.print(", ");
        }
    }

    public static List<String> readFromFile(String fileName) {
        Stream<String> stream = null;
        try {
            stream = Files.lines(Paths.get(fileName));
        } catch (NullPointerException | IOException e) {
            System.err.println("File not found! Exception thrown: " + e);;
        }
        return stream.collect(Collectors.toList());
    }
}