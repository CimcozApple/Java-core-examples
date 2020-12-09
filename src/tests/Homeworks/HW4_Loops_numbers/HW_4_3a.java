package tests.HW4_Loops_numbers;

// Write 4 programs called TriangularPatternX (X = A, B, C, D) that prompts user for the size
// (a non-negative integer in int); and prints each of the patterns as shown on picture below
//https://prnt.sc/qu7uim
//#
//# #
//# # #
//# # # #
//# # # # #
//# # # # # #
//# # # # # # #
//# # # # # # # #

import java.util.Scanner;

public class HW_4_3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");      // input = 8
        int sizeA = input.nextInt();

        for (int i = 1; i <= sizeA; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}