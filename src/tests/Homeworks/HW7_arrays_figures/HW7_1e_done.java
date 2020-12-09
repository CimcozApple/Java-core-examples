package tests.HW7_arrays_figures;
//1. Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown: https://prnt.sc/tz0lux

import java.util.Scanner;

public class HW7_1e_done {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size more than 4: ");
        int size = input.nextInt();

        if (size < 4) {
            System.out.println("Size entered incorrectly. Enter number more than 4");
            //return;
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    // left diagonal, right diagonal, top horizontal, bottom horizontal, left vertical, right vertical
                    if (i == j || i + j == size - 1 || i == 0 || i == size - 1 || j == 0 || j == size - 1)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}