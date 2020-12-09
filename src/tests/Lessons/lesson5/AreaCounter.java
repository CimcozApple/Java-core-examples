package L5;

public class AreaCounter {

  double countArea(double side1, double side2) {
    return side1 * side2;
  }

  int countArea(int x1, int x2) {
    return x1 * x2;
  }

  double countArea(double radius){
    return Math.PI * radius * radius;
  }

  double countArea(int radius){
    return Math.PI * radius * radius;
  }

}
