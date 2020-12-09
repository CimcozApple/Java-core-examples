package tests.HW11_enum_varargs;
//Write program which find all pairs on integer array whose sum is equal to given number

import java.util.Arrays;
import java.util.Scanner;

public class T4_array {
    public static void main(String[] args) {
        int[] array = {1, 5, 17, 10, 2, 13, 24, 15, 6, 9, 11, 12, 3, 4};
        System.out.println("Array: " + Arrays.toString(array));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int amount = input.nextInt();

        showPairs(array, amount);
    }

    public static void showPairs(int[] array, int sum) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == sum) {
                    count++;
                    System.out.println("Pair found at indexes: " + i + " and " + j);
                }
            }
        }
        System.out.print("Number of pairs which gives the entered amount is " + count);
    }
}

