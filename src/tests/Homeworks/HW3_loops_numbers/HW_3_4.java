package tests.HW3_loops_numbers;

//4. Write a program which take number of month from user and print out name of season (summer, winter ...)

import java.util.Scanner;

public class HW_3_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number: ");
        int numberOfMonth = input.nextInt();

        switch (numberOfMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println("A season is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("A season is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("A season is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("A season is autumn");
                break;
            default:
                System.out.println("It isn't a month number");
        }
    }
}
