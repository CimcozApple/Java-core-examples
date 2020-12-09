package tests.Lessons.lesson2;

import java.util.Scanner;

public class Task4 {
  //4. Write program which count area of triangle. All values user has to input in console. S=(a*b*sinA)/2
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input a:");
    double a = input.nextInt();
    System.out.println("Input double b:");
    int b = input.nextInt();
    System.out.println("Input alfa:");
    double alfa = input.nextDouble();
    System.out.println("Your result = " + a*b*Math.sin(alfa)/2);
  }

}
