package L4;
//Write a program to produce the sum of 1, 2, 3, ..., to 100.
//Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily.
//Also compute and display the average. The output shall look like:
//The sum of 1 to 100 is 5050
//The average is 50.5

public class Task1 {

//  public static void main(String[] args) {
//    int firstNumber = 1;
//    int lastNumber = 100;
//    int sum = 0;
//    for (int i = firstNumber; i<=lastNumber; i++){
//      sum += i;
//    }
//    double avg = (double) sum / lastNumber;
//    System.out.println("The sum of 1 to " + lastNumber + " is " + sum);
//    System.out.println("The average is " + avg);
//  }

  // 1.1. Modify the program to use a "while-do" loop instead of "for" loop.

//  public static void main(String[] args) {
//    int lastNumber = 100;
//    int sum = 0;
//    int i = 1;
//    while (i <= lastNumber){
//      sum += i;
//      i++;
//    }
//    double avg = (double) sum / lastNumber;
//    System.out.println("The sum of 1 to " + lastNumber + " is " + sum);
//    System.out.println("The average is " + avg);
//  }

  // 1.2. Modify the program to use a "do-while" loop.

//  public static void main(String[] args) {
//    int lastNumber = 100;
//    int sum = 0;
//    int i = 1;
//    do {
//      sum += i;
//      i++;
//    } while (i <= lastNumber);
//    double avg = (double) sum / lastNumber;
//    System.out.println("The sum of 1 to " + lastNumber + " is " + sum);
//    System.out.println("The average is " + avg);
//  }

  // 1.3. Modify the program to find the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.

//  public static void main(String[] args) {
//    int lastNumber = 100;
//    int sum = 0;
//    int i = 1;
//    do {
//      sum += i*i;
//      i++;
//    } while (i <= lastNumber);
//    System.out.println("The sum of squares of 1 to " + lastNumber + " is " + sum);
//  }

  // 1.4 Modify the program to produce two sums: sum of odd numbers and sum of even numbers from 1 to 100. Also computer their absolute difference.

  public static void main(String[] args) {
    int lastNumber = 100;
    int sum1 = 0;
    int sum2 = 0;
    int i = 1;
    int j = 0;
    do {
      sum1 += i;
      i+=2;
    } while (i <= lastNumber);
    do {
      sum2 += j;
      j+=2;
    } while (j <= lastNumber);
    System.out.println("sum1 = " + sum1);
    System.out.println("sum2 = " + sum2);
  }
}
