package tests.HW12_Exceptions;

public class T5_StackOverflowError {

        static int i = 0;
        public static int printFibonacci(int x)
        {return printFibonacci(i - 1) + printFibonacci(i - 2); }

    public static void main(String[] args)
    {
        T5_StackOverflowError.printFibonacci(i);  // Recursive call without any terminating condition
    }

}
