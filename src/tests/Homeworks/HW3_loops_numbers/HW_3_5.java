package tests.HW3_loops_numbers;

//5. Write the program which take name of color from user (red, blue, pink, green, black, white, yellow, orange )
// and print out length of this word. You can’t use .length() of String. Use switch operator

import java.util.Scanner;

public class HW_3_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color (in lowercase): ");
        String color = input.nextLine();
        int length;

        switch (color) {
            case "red":
                length = 3;
                break;
            case "blue":
            case "pink":
                length = 4;
                break;
            case "green":
            case "black":
            case "white":
                length = 5;
                break;

            case "yellow":
            case "orange":
                length = 6;
                break;
            default:
                length = 0;
        }
        System.out.println("Your color length = " + length + " symbols");
    }
}
