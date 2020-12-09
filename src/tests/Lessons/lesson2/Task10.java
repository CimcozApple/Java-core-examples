package tests.Lessons.lesson2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task10 {
  // 10. Write a program which print to console current date and time in format yyyy/MM/dd HH:mm:ss

  public static void main(String[] args) {
    Date date1 = new Date();
    SimpleDateFormat formattedDate1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    System.out.println("Current date: " + formattedDate1.format(date1));
  }

}
