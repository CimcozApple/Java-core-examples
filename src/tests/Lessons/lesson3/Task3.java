package tests.Lessons.lesson3;
// 3. Take three numbers from the user and print the greatest number

import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input a: ");
    int a = input.nextInt();
    System.out.println("Input b :");
    int b = input.nextInt();
    System.out.println("Input c :");
    int c = input.nextInt();

    if ((a > b) && (a > c)) {
      System.out.println("Greatest number -> a");
    }
    if ((b > a) && (b > c)) {
      System.out.println("Greatest number -> b");
    }
    if ((c > a) && (c > b)) {
      System.out.println("Greatest number -> c");
    }

    String m = (a > b) && (a > c) ? "Greatest number -> a" : "Incorrect value";
    System.out.println(m);
  }

}
