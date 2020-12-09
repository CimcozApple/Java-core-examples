package tests.HW4_Loops_numbers;

// 2. Write a program called Tribonacci to print the first 20 Tribonacci numbers
//0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504 ....

public class HW_4_2 {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.print(num1 + " ");

            int sumOfPrevious = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = sumOfPrevious;
        }
    }
}
