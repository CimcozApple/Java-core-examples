package tests.HW7_arrays_figures;
//    5. Write a program which print out 2dimensional array depending on the size which user set via console:
//    Output ->  Enter the size: 3
//            [[5, 4, 3],
//            [6, 9, 2],
//            [7, 8, 1]]

import java.util.Scanner;

public class HW7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of 2dimensional array: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        int value = 1;
        int row1 = 0;
        int col1 = 0;
        int row2 = n - 1;
        int col2 = n - 1;
        int k = 0;

        while (value <= n * n) {
            for (k = col1; k <= col2; k++)
                matrix[row1][k] = value++;

            for (k = row1 + 1; k <= row2; k++)
                matrix[k][col2] = value++;

            for (k = col2 - 1; k >= col1; k--)
                matrix[row2][k] = value++;

            for (k = row2 - 1; k >= row1 + 1; k--)
                matrix[k][col1] = value++;

            col1++;
            col2--;
            row1++;
            row2--;
        }

        System.out.println("Generated Matrix:");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < 10) {
                    System.out.print(matrix[i][j] + "\t ");
                } else {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
            System.out.println("]");
        }
    }
}