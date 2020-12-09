package tests.Lessons.lesson2;

import java.util.Scanner;

public class Task5 {
  //5. Write a program which converts number from decimal to hex view (input in command line)
  //// Enter a decimal number: 1234
  //// Decimal to hex: 4d2

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int a = input.nextInt();
    System.out.println("Decimal to hex: " + decToHex(a));
  }

  public static String decToHex(int dec) {
    return Integer.toHexString(dec);
  }

}
