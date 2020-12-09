package L3;

import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input a (int)");
    int a = input.nextInt();
    System.out.println("Input b (int)");
    int b = input.nextInt();
    System.out.println("Input c (int)");
    int c = input.nextInt();

    double x1;
    double x2;
    double D = b*b - 4*a*c;
    if (D > 0) {
      x1 = (-b + Math.sqrt(D)) / (2 * a);
      x2 = (-b - Math.sqrt(D)) / (2 * a);
      System.out.println("x1 = " + x1 + " and x2 = " + x2);
    } else if (0 == D) {
      x1 = (-b) / (2 * a);
      System.out.println("x1 = " + x1);
    } else {
      System.out.println("No roots");
    }
  }

}
