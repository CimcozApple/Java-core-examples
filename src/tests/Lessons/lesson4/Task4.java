package L4;
// 4. Write a program called Fibonacci to print the first 20 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average.
//Output:
//The first 20 Fibonacci numbers are:
//0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//The average is 885.5

public class Task4 {

  public static void main(String[] args) {
    int num1 = 0;
    int num2 = 1;
    for (int i = 1; i <= 21; i++){
      System.out.print(num1 + " ");
      int sumOfPrevious = num1 + num2;
      num1 = num2;
      num2 = sumOfPrevious;
    }
  }
}
