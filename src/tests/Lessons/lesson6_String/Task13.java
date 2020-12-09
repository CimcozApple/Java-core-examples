package tests.Lessons.lesson6_String;
// Write a Java program to read a string and an int n,
// return a string made of the first and last n characters from the string
public class Task13 {

  public static void main(String[] args) {
    String str = "Welcome to party";
    int n = 5;
    System.out.println(extractCorrectAmountOfElements(str, n));
  }

  private static String extractCorrectAmountOfElements(String str, int n) {
    return str.substring(0,n) + str.substring(str.length()-n);
  }
}
