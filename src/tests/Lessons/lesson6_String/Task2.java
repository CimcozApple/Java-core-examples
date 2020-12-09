package tests.Lessons.lesson6_String;
// Write a Java program
//to create a new String object with the contents of a character array
//to compare a given string to the specified character sequence
//to check whether a given string ends with the contents of another string (or contains)
public class Task2 {

  public static void main(String[] args) {
    char[] arr = new char[]{'1','2','r',' ','_'};
    String str = String.copyValueOf(arr);
    System.out.println(str);

    String str1 = "example1", str2 = "example2";
    CharSequence cs = "example1";
    System.out.println(str1.contentEquals(cs));
    System.out.println(str2.contentEquals(cs));

    System.out.println(str1.endsWith("e2"));
  }

}
