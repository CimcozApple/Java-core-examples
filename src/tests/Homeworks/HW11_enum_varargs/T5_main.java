package tests.HW11_enum_varargs;

import static tests.HW11_enum_varargs.T5_Varargs.varargs;

public class T5_main {

    public static void main(String[] args) {

        varargs(10, 15, 16.0, 18.9, 22.1, 4.15);  // 4,160,192.40
        varargs(9.99, 1.1, 5.7);                  // 62.6373
        varargs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);   // 3,628,800.00
    }
}
