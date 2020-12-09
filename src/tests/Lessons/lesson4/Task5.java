package L4;
// 5. Write a program to extract each digit from an int, in the reverse order.
//For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.

public class Task5 {

  public static void main(String[] args) {
    int n = 123443;
    while (n > 0){
      int digit = n % 10;
      System.out.print(digit + " ");
      n = n / 10;
    }
  }
}
