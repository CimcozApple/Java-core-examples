package tests.Lessons.lesson2;

public class Task6 {

  public static void main(String[] args) {
    int x = 9;
    int y;   // 9 0
    y = ++x; // 10 10
    y = x++; // 11 10
    y = --x; // 10 10
    y = --x; // 9 9
    y = x--; // 8 9
    System.out.println("The value of x " + x);
    System.out.println("The value of y " + y);

  }

}
