package tests.Lessons.lesson6_String;

// Write a java program to compare two strings lexicographically, ignoring case differences
public class Task1 {

  public static void main(String[] args) {
    String str1 = "This is Example1";
    String str2 = "This is exaple1";

    int result = str1.compareToIgnoreCase(str2);

    if (result < 0) {
      System.out.println("Str1 is less then Str2");
    } else if (0 == result) {
      System.out.println("Str1 is equal to Str2");
    } else {
      System.out.println("Str1 is bigger then Str2");
    }
  }
}
