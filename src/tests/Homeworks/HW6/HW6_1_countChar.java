package tests.HW6;
//Write program which print out how much times each character is in initial string

import java.util.Scanner;

public class HW6_1_countChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text: ");         //"characters in initial string"
        String text = input.nextLine();

        char [] basic = new char[256];
        for (int i = 0; i < text.length(); i++) {
            basic[text.charAt(i)]++;
        }

        for (int j = 0; j < basic.length; j++) {
            if (basic[(j)] != 0)
                System.out.println("Char " + (char) j + " Number of repeats " + (int) basic[(j)]);
        }

    }
}

//
//    int countA = text.length() - text.replace("a", "").length();
//    int countC = text.length() - text.replace("c", "").length();
//    int countH = text.length() - text.replace("h", "").length();
//    int countR = text.length() - text.replace("r", "").length();
//    int countT = text.length() - text.replace("t", "").length();
//    int countE = text.length() - text.replace("e", "").length();
//    int countS = text.length() - text.replace("s", "").length();
//    int countI = text.length() - text.replace("i", "").length();
//    int countN = text.length() - text.replace("n", "").length();
//    int countL = text.length() - text.replace("l", "").length();
//    int countG = text.length() - text.replace("g", "").length();
//
//        System.out.println("A " + "C " + "H " + "E " + "G " + "I " + "L " + "N " + "R " + "S " + "T ");
//                System.out.println("= = = = = = = = = = =");
//                System.out.println(countA + " " + countC + " " + countH + " " + countE + " " + countG + " " + countI + " "
//                + countL + " " + countN + " " + countR + " " + countS + " " + countT);

