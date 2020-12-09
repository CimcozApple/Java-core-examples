package tests.HW6;
//Write a Java program to reverse words in a initial string. The given string is: Reverse text in a string
//The new string after reversed the words: string a in text Reverse

public class HW6_4_reverseWords {
    public static void main(String[] args) {
        String text = "Reverse text in a string";
        System.out.println("Initial text: " + text);
        String[] wordInSentence = reverseChars(text).split(" ");

        String reverseSentence = "";
        for (int i = 0; i < wordInSentence.length; i++) {
            reverseSentence += reverseChars(wordInSentence[i]) + " ";
        }
        System.out.println("Reversed text: " + reverseSentence);
    }

    static String reverseChars(String chars) {
        if (chars.isEmpty())
            return chars;
        return reverseChars(chars.substring(1)) + chars.charAt(0);
    }
}
