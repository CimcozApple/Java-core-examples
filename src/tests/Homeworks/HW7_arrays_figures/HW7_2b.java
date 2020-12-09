package tests.HW7_arrays_figures;
//2. Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown: https://prnt.sc/tz0mbn

import java.util.Scanner;

public class HW7_2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input size: ");
        int size = input.nextInt();

        for (int i = size; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

//1 2 3 4 5 6 7 8
//  1 2 3 4 5 6 7
//    1 2 3 4 5 6
//      1 2 3 4 5
//        1 2 3 4
//          1 2 3
//            1 2
//              1