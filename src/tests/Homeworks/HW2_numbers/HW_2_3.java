package tests.HW2_numbers;

import java.util.Scanner;

public class HW_2_3 {
    // Write a program which converts number from hex to decimal view (input in command line)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();                  // hex = 2A3DF8A7

        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Hex to decimal: " + decimal);
    }
}
