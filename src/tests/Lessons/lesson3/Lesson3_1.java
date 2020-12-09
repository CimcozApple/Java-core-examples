package tests.Lessons.lesson3;

import java.util.Scanner;

public class Lesson3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hex number: ");
        int input = sc.nextInt();

        if (input > 0) {
            System.out.println("positive");
        } else if (input < 0) {
            System.out.println("negative");
        } else {
            System.out.println("it is zero");
        }
    }
}
