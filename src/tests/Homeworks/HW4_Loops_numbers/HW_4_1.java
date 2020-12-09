package tests.HW4_Loops_numbers;

//1. Write a program to compute the value of Euler number, using the following series expansion.
//Use the maximum denominator as the terminating condition. Try maxDenominator of 1000, 10000, 100000,
//HINT: e=1/0!+1/1!+1/2!+1/3!+1/4!+1/5!+1/6!+...

import java.math.BigDecimal;
import java.math.BigInteger;

public class HW_4_1 {

    public static void main(String[] args) {

        BigDecimal e = new BigDecimal(0.0);                          // e will accumulate the sum of 1/i! for an ever increasing i
        for (int i = 0; i < 100; i++) {
            BigDecimal temp1 = new BigDecimal(1.0);                  // to divide need two BigDecimals, the numerator is 1
            BigDecimal temp2 = new BigDecimal(factorial(i));             // the denominator is i! which gets from calling the factorial method
            temp2 = temp1.divide(temp2, 100, BigDecimal.ROUND_UP);  // compute 1/i!, to ensure a limit to the iterations when division is limitless like 1/3
            e = e.add(temp2);                                             // add the latest 1/i! to e
        }
        System.out.println("Euler number = " + e);                       // output our computed e
    }

    public static BigInteger factorial(int x)                            // BigInteger using for factorial because int and long are too limited in precision
    {
        BigInteger temp = new BigInteger("1");                       // start with a BigInteger = 1 (constructor requires a String, not an int)
        for (int i = 1; i <= x; i++)
            temp = temp.multiply(new BigInteger("" + i));
        return temp;
    }
}