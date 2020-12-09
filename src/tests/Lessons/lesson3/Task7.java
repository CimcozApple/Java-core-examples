package L3;

import java.util.Scanner;

// 7. Write a Java program to find the number of days in a month
public class Task7 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input month number: ");
    String monthName = in.nextLine();
    System.out.println("Input year: ");
    int year = in.nextInt();

    int numberOfDays = 0;
    if ((monthName.equals("January")) || (monthName.equals("March")) || (monthName.equals("May"))){
      numberOfDays = 31;
    } else if (monthName.equals("February")){
      if (isYearLeap(year)){
        numberOfDays = 29;
      } else {
        numberOfDays = 28;
      }
    } else if ((monthName.equals("April")) || (monthName.equals("June"))){
      numberOfDays = 30;
    }

    switch (monthName){
      case "January":
      case "Febrary":
        numberOfDays = 28;
        break;
      case "March":
        numberOfDays = 31;
        break;
      case "April":
        numberOfDays = 30;
        break;
      case "May":
        numberOfDays = 31;
        break;
      default:
        numberOfDays = 0;
    }
    System.out.println("Amount of days in " + monthName + " is " + numberOfDays);
  }

  static boolean isYearLeap(int y){
    boolean result;
    if (y%4 == 0){
      result = true;
    } else {
      result = false;
    }
    return result;
  }
}
