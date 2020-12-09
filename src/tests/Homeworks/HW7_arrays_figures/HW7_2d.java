package tests.HW7_arrays_figures;
//2. Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown: https://prnt.sc/tz0mbn

import java.util.Scanner;

public class HW7_2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input size: ");
        int size = input.nextInt();

        for (int i = size; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print((i - k + 1) + " ");
            }
            System.out.println();
        }
    }
}

//        8 7 6 5 4 3 2 1
//        7 6 5 4 3 2 1
//        6 5 4 3 2 1
//        5 4 3 2 1
//        4 3 2 1
//        3 2 1
//        2 1
//        1