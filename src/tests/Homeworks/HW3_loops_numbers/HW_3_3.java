package tests.HW3_loops_numbers;

import java.util.Scanner;

//3. Write a Java program that takes a year from user and print whether that year is a leap year or not.

public class HW_3_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 4 != 0 && year % 100 != 0 && year % 400 != 0) {
            System.out.println("It is a usual year with 365 days");
        } else {
            System.out.println("It is a leap year with 366 days");
        }
    }
}

