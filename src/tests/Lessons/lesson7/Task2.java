package L7;

import java.util.Scanner;

// Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown:
//                                    1
//                                  2 1
//                                3 2 1
//                              4 3 2 1
//                            5 4 3 2 1
//                          6 5 4 3 2 1
//                        7 6 5 4 3 2 1
//                      8 7 6 5 4 3 2 1

public class Task2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inout size: ");
    int size = input.nextInt();
    for (int i = 0; i < size; i++) {
      for (int p = 1; p < size - i; p++) {
        System.out.print("  ");
      }
      for (int j = 0; j < i + 1; j++) {
        System.out.print((i - j + 1) + " ");
      }
      System.out.println();
    }
  }
}

