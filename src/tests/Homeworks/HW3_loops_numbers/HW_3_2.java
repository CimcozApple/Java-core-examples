package tests.HW3_loops_numbers;

//2. Write a program which take string from console and print out whether it contains numbers,
// uppercase symbols, lowercase symbols, special characters (!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)

import java.util.Scanner;

public class HW_3_2 {
//
    public static void main(String[] args) {

        int upperCase = 0;
        int lowerCase = 0;
        int numbers = 0;
        int specialChars = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text: ");           //@Test_ALL%=2020/s.y:M;b=o'lS'()^33#
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char number = text.charAt(i);
            if (number >= 'A' && number <= 'Z') {
                upperCase++;
            } else if (number >= 'a' && number <= 'z') {
                lowerCase++;
            } else if (number >= '0' && number <= '9') {
                numbers++;
            } else {
                specialChars++;
            }
        }
        System.out.println("Lower case letters : " + lowerCase);
        System.out.println("Upper case letters : " + upperCase);
        System.out.println("Number : " + numbers);
        System.out.println("Special characters : " + specialChars);
    }
}