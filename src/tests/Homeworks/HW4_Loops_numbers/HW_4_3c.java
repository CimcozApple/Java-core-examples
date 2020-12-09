package tests.HW4_Loops_numbers;

//# # # # # # # #
//  # # # # # # #
//    # # # # # #
//      # # # # #
//        # # # #
//          # # #
//            # #
//              #

import java.util.Scanner;

public class HW_4_3c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");      // input = 8
        int sizeC = input.nextInt();

        for (int i = sizeC; i >= 1; i--) {
            for (int j = sizeC; j > i; j--) {
                System.out.print("  ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print((star) + " ");
            }
            System.out.println();
        }
    }
}
