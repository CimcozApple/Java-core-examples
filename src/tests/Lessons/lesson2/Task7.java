package tests.Lessons.lesson2;

public class Task7 {

  public static void main(String[] args) {
    int x = 2;
    int y = 6;
    y = x++ * y++; // 3, 12
    x *= x + y;    // 51 14
    y = y + ++x;   // 52 66
    x = 1 + x + y; // 119 66
    y = (x - y - 1) / 3; // 119 17
    System.out.println("The value of x " + x);
    System.out.println("The value of y " + y);

  }

}
