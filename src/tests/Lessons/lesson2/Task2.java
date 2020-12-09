package tests.Lessons.lesson2;

import static java.lang.Math.*;

class Task2 {
  //2. Write a program which count the area of circle and print result in console. You know radius, value can be fractional
  static void main(String[] args) {
    double radius = 5.0;
    double area = countArea(radius);

    System.out.println("area = " + area);
  }

  static double countArea(double r){
    return PI * pow(r, 2);
  }
}
