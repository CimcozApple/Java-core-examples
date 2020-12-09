package tests.Lessons.lesson6_String;
// Write a Java program to print after removing duplicates from a given string
public class Task5_removeDuplicates {

  public static void main(String[] args) {
    String str = "w3resource";
    System.out.println(removeDuplicateChars(str));
  }

  static String removeDuplicateChars(String str1) {
    char[] arr = str1.toCharArray();
    String target = "";
    for (char value : arr){
      if (-1 == target.indexOf(value)){
        target += value;
      }
    }
    return target;
  }
}
