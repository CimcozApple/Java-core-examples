package tests.HW5_recrsion_sorting_overload;
// Write program which create an array from 20 integers with random values, write method with sort them
// in increase order, use Insertion sort type

public class HW_5_5_InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {                  // i - start element to the end of the list; ;
            int keyValue = arr[i];                     // keyValue - number in the list
            int index = i - 1;                         // inner loop = i-1 to 0

            while (index >= 0 && keyValue < arr[index]) {
                arr[index+1] = arr[index];
                index = index - 1;
            }
            arr[index+1] = keyValue;
        }
    }
}
