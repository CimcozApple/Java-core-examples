package L4;
//3. Write a program called ComputePI to compute the value of π, using the following series expansion.
//Use the maximum denominator (maxDenominator) as the terminating condition. Try maxDenominator of 1000, 10000, 100000,
//HINT: pi=4*(1-1/3+1/5-1/7+1/9-1/11+1/13-1/15+...)

public class Task3 {

  public static void main(String[] args) {
    double sum = 0.0;
    int maxDenominator = 100000;
    for(int d = 1; d <= maxDenominator; d += 2){
      if (d % 4 == 1) {
        sum += 1.0 / d;
      }
      if (d % 4 == 3) {
        sum -= 1.0 / d;
      }
    }
    System.out.println("sum = " + sum * 4);
    System.out.println("PI  = " + Math.PI);
  }
}
