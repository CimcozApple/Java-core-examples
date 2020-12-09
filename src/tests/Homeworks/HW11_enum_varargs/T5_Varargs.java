package tests.HW11_enum_varargs;
//Write class which contains just 1 method which returns the result of multiplication of all doubles which it receives.
// It can receive any amount of double numbers.
//Add usage of it in main in other class

import java.util.Locale;

public class T5_Varargs {

    static double varargs(double... doubles) {
        System.out.println("Number of arguments: " + doubles.length);
        double sum = 1;
        for (int i = 0; i < doubles.length; i++) {
            sum = sum * doubles[i];
        }
        System.out.print("Multiplication of the elements = ");
        System.out.printf(Locale.UK, "%,.2f %n", sum);
        return sum;
    }
}