package tests.Lessons.lesson2;

import java.util.Random;

public class Task9 {
  // 9.  Write a program which generate random natural number from 1 to 1000.

  public static void main(String[] args) {
    Random rand = new Random();

    int n = rand.nextInt(1000) + 1;
    System.out.println(n);
  }

}
