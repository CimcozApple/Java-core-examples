package tests.HW3_loops_numbers;

//1. Write a program which take four numbers from the user and print out just that few of them
// which divide by 3 or 5 without remainder

import java.util.Scanner;

public class HW_3_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter your number 2: ");
        int number2 = input.nextInt();
        System.out.print("Enter your number 3: ");
        int number3 = input.nextInt();
        System.out.print("Enter your number 4: ");
        int number4 = input.nextInt();

        if (number1 % 3 == 0 || number1 % 5 == 0) {
            System.out.println("Number 1 divides by 3 or 5 without remainder " + number1);
        }
        if (number2 % 3 == 0 || number2 % 5 == 0) {
            System.out.println("Number 2 divides by 3 or 5 without remainder " + number2);
        }
        if (number3 % 3 == 0 || number3 % 5 == 0) {
            System.out.println("Number 3 divides by 3 or 5 without remainder " + number3);
        }
        if (number4 % 3 == 0 || number4 % 5 == 0) {
            System.out.println("Number 4 divides by 3 or 5 without remainder " + number4);
        }
    }
}
