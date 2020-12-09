package tests.HW2_numbers;

import java.util.Scanner;

import static java.lang.Math.*;

public class HW_2_2 {
//Write a program which count the volume of cylinder and print result in console. Radius and height user input from console

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter a height: ");
        double height = input.nextDouble();

        double volume = PI * pow(radius, 2) * height;
        System.out.println("The volume of cylinder: " + volume);
    }
}
