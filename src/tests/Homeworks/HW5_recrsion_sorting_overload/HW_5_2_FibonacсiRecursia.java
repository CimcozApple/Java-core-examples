package tests.HW5_recrsion_sorting_overload;
// Print out first 20 Fibonacсi numbers using recursion ( F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1 )

public class HW_5_2_FibonacсiRecursia {

    public static void main(String[] args) {
        int maxNumber = 20;
        System.out.println(maxNumber + " Fibonacci numbers using recursion:");

        for (int i = 0; i <= maxNumber; i++) {
            System.out.print(printFibonacci(i) + " ");
        }
    }

    public static int printFibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return number = 1;
        }
        return printFibonacci(number - 1) + printFibonacci(number - 2);
    }
}
