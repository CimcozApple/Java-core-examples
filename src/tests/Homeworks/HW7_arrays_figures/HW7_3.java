package tests.HW7_arrays_figures;
//3. Write a program called printArrayInStars which prompts user for the number of items in an array (a non-negative integer),
// and saves it in an int variable called numItems.
//It then prompts user for the values of all the items (non-negative integers) and saves them in an int array called items.
//The program shall then print the contents of the array in a graphical form, with the array index and values represented by number of stars.
//Output ->
//        Enter the number of items: 5
//        Enter the value of all items (separated by space): 7 4 3 0 7
//        0: *******(7)
//        1: ****(4)
//        2: ***(3)
//        3: (0)
//        4: *******(7)

import java.util.Scanner;

public class HW7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numItems = input.nextInt();

        int[] array = new int[numItems];

        System.out.print("Enter the value of all items: ");
        for (int items = 0; items < array.length; items++) {
            array[(items)] = input.nextInt();
            System.out.print(items + ": ");

            for (int i = 0; i < array[items]; i++) {
                System.out.print("*");
            }
            System.out.println(" (" + array[(items)] + ")");
        }
    }
}
