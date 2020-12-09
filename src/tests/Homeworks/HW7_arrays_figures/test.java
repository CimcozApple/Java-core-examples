package tests.HW7_arrays_figures;

public class test {

    public static void main(String[] args) {
        int n = 3;
        int a[][] = new int[n][n];
        int value = 1;
        int row1 = 0;
        int col1 = 0;
        int row2 = n - 1;
        int col2 = n - 1;
        int i = 0;
        int j = 0;
        while (value <= n * n) {
            for (i = col1; i <= col2; i++)
                a[row1][i] = value++;

            for (i = row1 + 1; i <= row2; i++)
                a[i][col2] = value++;

            for (i = col2 - 1; i >= col1; i--)
                a[row2][i] = value++;

            for (i = row2 - 1; i >= row1 + 1; i--)
                a[i][col1] = value++;

            col1++;
            col2--;
            row1++;
            row2--;
        }
        System.out.println("Generated Matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
}

