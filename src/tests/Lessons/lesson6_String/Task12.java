package tests.Lessons.lesson6_String;
// Write a Java program to append two given strings such that,
// if the concatenation creates a double characters then omit one of the characters
public class Task12 {

  public static void main(String[] args) {
    String str2 = "door";
    String str1 = "food";
    System.out.println(cleverConcatinate(str1, str2));
  }

  private static String cleverConcatinate(String str1, String str2) {
    if (str1.length() != 0 && str2.length() != 0
        && str1.charAt(str1.length() -1) != str2.charAt(0)){
      return str1 + str2;
    } else {
      return str1 + str2.substring(1);
    }
  }
}
