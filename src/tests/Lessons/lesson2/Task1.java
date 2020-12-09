package tests.Lessons.lesson2;

public class Task1 {
  // 1. Write a program which multiply 3 natural numbers and print results in console

  public static void main(String[] args) {
    int a = 3;
    int b = 4;
    int c = 5;
    int x = multiply(a, a, a);
    printMyText(x);
    justPrintHello();
  }

  static int multiply(int x1, int x2, int x3){
    int m = x1 * x2 * x3;
    return m;
  }

  static void printMyText(int t){
    System.out.println("x = " + t);
  }

  static void justPrintHello(){
    System.out.println("Hello");
  }

}
