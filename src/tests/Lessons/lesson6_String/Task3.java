package tests.Lessons.lesson6_String;

import java.util.Calendar;

// Write a java program to print current date and time in the specified format
public class Task3 {

  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    System.out.format("%tB, %te, %tY", c ,c ,c);

  }
}
