package tests.HW4_Loops_numbers;
//# # # # # # # #
//# # # # # # #
//# # # # # #
//# # # # #
//# # # #
//# # #
//# #
//#

import java.util.Scanner;

public class HW_4_3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");      // input = 8
        int sizeB = input.nextInt();

        for (int i = sizeB; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
