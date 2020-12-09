package tests.Lessons.lesson6_String;

// Write a Java program to remove duplicate characters from a given string presents in another given string
public class Task8_mask {

    public static void main(String[] args) {
        String str1 = "the quicke brown fox";
        String str2 = "queen";

        char mask[] = new char[256];
        for (int i = 0; i < str2.length(); i++) {
            mask[str2.charAt(i)]++;
        }
        for (int j = 0; j < str1.length(); j++) {
            if (mask[str1.charAt(j)] == 0) {
                System.out.print(str1.charAt(j));
            }
        }
    }
}
