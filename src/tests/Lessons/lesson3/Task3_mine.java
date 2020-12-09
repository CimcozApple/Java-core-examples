package tests.Lessons.lesson3;

// 3. Take three numbers from the user and print the greatest number

import java.util.Scanner;

public class Task3_mine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = input.nextInt();
        System.out.println("Input b :");
        int b = input.nextInt();
        System.out.println("Input c :");
        int c = input.nextInt();

        if (a > b) {
            System.out.println("Greatest number -> " + Math.max(a, c));
        } else {
            System.out.println("Greatest number -> " + Math.max(b, c));
        }
    }
}
