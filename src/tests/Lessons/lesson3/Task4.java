package L3;

import java.util.Scanner;

// 4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
//Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000
public class Task4 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input decimal number: ");
    double input = in.nextDouble();

    if (input > 0) {
      if (input < 1) {
        System.out.println("Positive small number");
      }
      if (input > 1000000) {
        System.out.println("Positive large number");
      } else if ((input >= 1) && (input <= 1000000)) {
        System.out.println("Positive number");
      }
    } else if (input < 0) {
      if (Math.abs(input) < 1) {
        System.out.println("Negative small number");
      }
      if (Math.abs(input) > 1000000) {
        System.out.println("Negative large number");
      } else if ((Math.abs(input) >= 1) && (Math.abs(input) <= 1000000)) {
        System.out.println("Negative number");
      }
    } else {
      System.out.println("Number == zero");
    }
  }
}
