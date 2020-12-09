package L5;
// 1. Write program which print out numbers using recursion:
//3 2 1 1 2 3
public class Task2 {

  public static void main(String[] args) {
    int test=3;
    printNumbers(test);
  }

  static void printNumbers(int t){
    if (t<1){
      return;
    } else{
      System.out.printf("%d ", t);
      printNumbers(t - 1);
      System.out.printf("%d ", t);
    }
  }
}
