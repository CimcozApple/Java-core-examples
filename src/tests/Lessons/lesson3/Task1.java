package tests.Lessons.lesson3;
// 1. Write a Java program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input decimal number: ");
    int input = in.nextInt();

    if (input > 0) {
      System.out.println("Number is positive");
    } else if (input < 0) {
      System.out.println("Number is negative");
    } else {
      System.out.println("Number == zero");
    }
  }

}
