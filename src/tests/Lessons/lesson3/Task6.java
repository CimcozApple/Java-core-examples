package L3;

import java.util.Scanner;

//6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places
public class Task6 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input float number: ");
    float f1 = in.nextFloat();
    System.out.println("Input float number: ");
    float f2 = in.nextFloat();

    f1 = Math.round(f1 * 1000);
    f1 = f1 / 1000;

    f2 = Math.round(f2 * 1000);
    f2 = f2 / 1000;

    if (f1 == f2){
      System.out.println("f1 and d2 are equal up to 3 decimal places");
    } else {
      System.out.println("f1 and f2 are different");
    }
  }
}
