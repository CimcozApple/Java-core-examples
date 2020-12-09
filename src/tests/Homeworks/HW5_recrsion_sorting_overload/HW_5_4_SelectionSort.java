package tests.HW5_recrsion_sorting_overload;
//Write program which create an array from 20 integers with random values, write method with sort them in increase order, use Selection sort type
//This algorithm divides the lists into two parts: the left-sublist of items already sorted, and the right-sublist for
// the remaining items. Initially, the left-sorted-sublist is empty, while the right-unsorted-sublist is the entire list.
// The algorithm proceeds by finding the smallest (or largest) items from the right-unsorted-sublist, swapping it with
// the leftmost element of the right-unsorted-sublist, and increase the left-sorted-sublist by one.

public class HW_5_4_SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValueId = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValueId]) {
                    minValueId = j;
                }
            }
            int smallerNumber = arr[minValueId];
            arr[minValueId] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}