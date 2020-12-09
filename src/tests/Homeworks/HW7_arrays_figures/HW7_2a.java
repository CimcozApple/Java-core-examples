package tests.HW7_arrays_figures;
//2. Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown: https://prnt.sc/tz0mbn

import java.util.Scanner;

public class HW7_2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input size: ");
        int size = input.nextInt();

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print((k + 1) + " ");
            }
            System.out.println();
        }
    }
}

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
//        1 2 3 4 5 6 7
//        1 2 3 4 5 6 7 8