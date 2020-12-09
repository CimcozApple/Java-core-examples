package tests.HW2_numbers;

public class HW_2_4 {
/* Create your own example with increment/decrement, count it manually and then run program and verify your value.
   Example has to contain more then 5 increment operation, more then 5 decrement operations, *=, +=, -=,
    and more then 5 resetting of value for each variable.
*/

    public static void main(String[] args) {
//        int x = 7;
//        int y = 8;
        int x = 2;
        int y = 3;
        y = x++ - --y * (++x + ++y);

//        x = ++y + ++x;                  // x= 17, y =9
//        y += y-- + x;                   // x= 17, y =9+9+17=35
//        x = x - y-- + 5;                // x=-13, y = 34
//        y = x++ + y++ + --x;            // x=-13, y = 8
//        x = x + 2 * y;                  // x= 3, y = 8
//        y -= --y / 2 + x--;             // x= 2, y = 8-(7/2)+3=1,5=2
//        y = y + x++;                    // x= 3, y = 4
//        x *= y + 1 - --x;               // x=3*(4+1-2)=9, y =4
//        x = y-- + 7 + x;                // x=4+7+9=20, y = 3
//        y = y * 2 + x / 5;              // x= 20, y = 10
//        x = (x - y + 16) / 8;           // x= 3, y = 10
//        y = y + x * 2 + (x++ * 3) / 4;  // x= 4, y = 10+6+2=18

        System.out.println("The value of x " + x);
        System.out.println("The value of y " + y);
    }
}
