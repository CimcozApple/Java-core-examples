package L5;
// 0. Create a class to print the area of a square and a rectangle.
// The class has two methods with the same name but different number of parameters.
// The method for printing area of rectangle has two parameters which are length and breadth
// respetively while the other method for printing area of square has one parameter which is side
// of square.
public class Task0 {

  public static void main(String[] args) {

    L5.AreaCounter counter = new L5.AreaCounter();

    System.out.println(counter.countArea(2.0, 3.0));
    System.out.println(counter.countArea(1, 3));

    System.out.println(counter.countArea(1));
    System.out.println(counter.countArea(2.0));
  }

}
