package tests.HW7_arrays_figures;
//4. Write a program which print out table of how many times each character is present in initial String
// (ignore case of charachter). //Output -> Initial String: Hillel
//1 occurance - 'h', 'i', 'e'
//3 occurance - 'l'

import java.util.Scanner;

public class HW7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Initial String: "); //Hillel
        String text = input.nextLine();
        text = text.toLowerCase();

        char[] basic = new char[256];
        for (int i = 0; i < text.length(); i++) {
            basic[text.charAt(i)]++;
        }

        for (int j = 0; j < basic.length; j++) {
            if (basic[(j)] != 0)
           
            System.out.printf((int) basic[(j)] + " occurance - " + "\'" + "%s " + "\'" + ", ", (char) (j));
//            System.out.println(String.format("%s occurance - ", (int) basic[(j)]));
//            System.out.print((char) j );

        }

    }
}

