package L4;
// 2. Write a program to count factorial of natural numbers from 1 to 10

public class Task2 {

  public static void main(String[] args) {
    int number = 13;
    long fact = 1;
    for(int i=1; i<=number; i++){
      fact = fact * i;
    }
    System.out.println("Factorial of " + number + " is " + fact);
  }
}
