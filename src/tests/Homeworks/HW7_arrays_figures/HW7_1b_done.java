package tests.HW7_arrays_figures;
//1. Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown: https://prnt.sc/tz0lux

import java.util.Scanner;

public class HW7_1b_done {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input size: ");
        int size = input.nextInt();

        for (int row = size; row >= 0; row--) {
            for (int column = 0; column < size; column++) {
                if (row == 1 || row == size || column == size  - row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
