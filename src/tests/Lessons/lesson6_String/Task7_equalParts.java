package tests.Lessons.lesson6_String;

// Write a Java program to divide a string in n equal parts
public class Task7_equalParts {

  public static void main(String[] args) {
    String str = "abcdefghijklmnopqrstuvwxt";
    int splitValue = 5;
    splitString(str, splitValue);
  }

  private static void splitString(String str, int splitValue) {
    int strSize = str.length();
    if (strSize % splitValue != 0) {
      System.out.println("The size of string can't be divided to " + splitValue);
      return;
    } else {
    int partSize = strSize / splitValue;
    for (int i=0; i < strSize; i++){
      if (i % partSize == 0){
        System.out.println();
      }
      System.out.print(str.charAt(i));
    }
    }
  }
  }
