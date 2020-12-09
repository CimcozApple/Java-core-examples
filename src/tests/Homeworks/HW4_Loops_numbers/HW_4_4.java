package tests.HW4_Loops_numbers;

// 4. Write a program to extract each digit from a double, in the reverse order.
//For example, if the double is 2522.43034, the output shall be " 4 3 0 3 4 . 2 2 5 2",
// with a space separating the digits.

import java.util.Scanner;

public class HW_4_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        String number = input.nextLine();  // 2522.43034

        StringBuilder strNumber = new StringBuilder();

        for (int i = number.length() - 1; i >= 0; i--) {
            strNumber.append(number.charAt(i) + " ");
        }
        System.out.print("Reversed number is: " + strNumber.toString());
    }
}