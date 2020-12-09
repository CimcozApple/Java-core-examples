package tests.dop.lesson1;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = {1, 3, 5, 7, 8};
        String[] array4 = new String[5];
        System.out.println(array.length);
        System.out.println(array2.length);
        L4.ForLoop loop = new L4.ForLoop();

        Object[] array3 = {loop, 1, 2.0};


        array[0] = 10;

        int a;
        String b;

        for(int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        for(String x : array4) {
            System.out.print(x + " ");
        }
    }
}
