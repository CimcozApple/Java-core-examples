package tests.Lessons.lesson6_String;
// Write a Java program to get the index of all the characters of the alphabet.
//Sample string of all alphabet: "the quick brown fox jumps over the lazy dog"
public class Task4 {

  public static void main(String[] args) {
    String str = "the quick brown fox jumps over the lazy dog";

    int a = str.indexOf("a");
    int b = str.indexOf("b");
    int c = str.indexOf("c");
    int d = str.indexOf("d");
    int e = str.indexOf("e");

    System.out.println("a b c d e");
    System.out.println("=========");
    System.out.println(a + " " + b + " " + c + " " + d + " " + e);

  }
}
