package L3;

import java.util.Scanner;

// 5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday
public class Task5 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input decimal number from 1 to 7: ");
    int input = in.nextInt();
    printWeekDay(input);
  }

  static void printWeekDay(int k) {
    switch (k) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Not such weekday");
    }
  }
}