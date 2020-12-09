package L7;

import java.util.Scanner;

// Write a program with method sum(int n) which receives one parameter and return sum of all previous natural numbers (till zero) using recursion
public class Task5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inout size: ");
    int n = input.nextInt();
    int sum = sum(n);
    System.out.println("Sum = " + sum);
  }

  private static int sum(int n) {
    if (1 == n) {
      return 1;
    } else {
      return n + sum(n - 1);
    }
  }

}
