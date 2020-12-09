package tests.HW6;
//Write a Java program to reverse a string using recursion
//The given string is: The quick brown fox jumps
//The string in reverse order is: spmuj xof nworb kciuq ehT

public class HW6_3_reverseChars {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps";
        System.out.println("Initial text: " + text);
        System.out.print("Reversed text: " + reverseString(text));
    }

    static String reverseString(String chars) {
        if (chars.isEmpty())
            return chars;
        return reverseString(chars.substring(1)) + chars.charAt(0);
    }
}