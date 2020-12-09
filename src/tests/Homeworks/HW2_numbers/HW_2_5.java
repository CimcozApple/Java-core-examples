package tests.HW2_numbers;

import java.util.Scanner;

import static java.lang.Math.*;

public class HW_2_5 {
    // Write a program which count x1, x2 for quadratic equation. Input a, b, c from console.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value A: ");
        double a = input.nextDouble();
        System.out.print("Enter value B: ");
        double b = input.nextDouble();
        System.out.print("Enter value C: ");
        double c = input.nextDouble();

        double d = pow(b, 2) - (4 * a * c);
        System.out.println("D = " + d);

        double x1;
        double x2;

        if (d > 0) {                                         // check by: 1  -8  12
            x1 = (-1 * b + sqrt(d)) / (2 * a);
            x2 = (-1 * b - sqrt(d)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0) {
            x1 = (-1 * b) / (2 * a);                  // check by: 2,25  3   1

            System.out.println("x1, x2 = " + x1);
        } else {
            System.out.println("d < 0");
        }
    }
}
