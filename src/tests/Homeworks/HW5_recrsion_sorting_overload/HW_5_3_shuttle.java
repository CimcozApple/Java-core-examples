package tests.HW5_recrsion_sorting_overload;
//Write program which create an array from 20 integers with random values, write method with shuffle elements of array in random order

import java.util.Arrays;
import java.util.Random;

public class HW_5_3_shuttle {
    public static void main(String[] args) {
        int[] array = new int[10];
        int n = array.length;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        shuffle(array, n);
        System.out.println();
        System.out.println(Arrays.toString(array));
    }

    static void shuffle(int array[], int n) {
        Random list = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = list.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
