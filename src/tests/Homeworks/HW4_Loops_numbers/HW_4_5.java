package tests.HW4_Loops_numbers;

// 5. Write program which print out next image using loops:
//    *
//   * *
//  * * *
// * * * *
//* * * * *

public class HW_4_5 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int space = row - i; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (i + 1) - 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
