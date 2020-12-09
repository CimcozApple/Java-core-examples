package tests.HW4_Loops_numbers;

// 4. Write a program to extract each digit from a double, in the reverse order.
//For example, if the double is 2522.43034, the output shall be " 4 3 0 3 4 . 2 2 5 2", with a space separating the digits.
// in this example using BigDecimal and number shows as 43.2525 - with less symbols

import java.math.BigDecimal;
import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        System.out.print("Enter a decimal number > ");
        Scanner scanner = new Scanner(System.in);
        BigDecimal num = scanner.nextBigDecimal();

        int integerPart = num.intValue();                          // separate the integer part
        BigDecimal dp = num.remainder(BigDecimal.ONE);             // separate the decimal part

        while (dp.remainder(BigDecimal.ONE).doubleValue() > 0) {    // convert the decimal part into an integer
            dp = dp.movePointRight(1);
        }
        int decimalPart = dp.intValue();
        System.out.print("Decimal number in reverse order > ");

        int remainder;
        while ((remainder = decimalPart % 10) != 0) {                // reverse the decimal part
            System.out.print(remainder);
            decimalPart = decimalPart / 10;
            System.out.print(" ");
        }
        System.out.print(". ");

        while ((remainder = integerPart % 10) != 0) {                // reverse the integer part
            System.out.print(remainder);
            integerPart = integerPart / 10;
            System.out.print(" ");
        }
    }
}
