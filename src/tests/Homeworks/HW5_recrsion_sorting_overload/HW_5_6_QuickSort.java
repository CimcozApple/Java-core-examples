package tests.HW5_recrsion_sorting_overload;
//Recursive Quick Sort. Quicksort is a recursive divide and conquer algorithm. It divides the list into two sublists -
// the low elements and the high element, and recursively sort the sublists. The steps are:
//- Pick an element, called pivot, from the list.
//- Partitioning: reorder the list such that the smaller elements come before the pivot, and the larger elements after
// the pivot. After the partitioning, the pivot is in its final position.
//- Recursively apply the above step to the sub-lists.

public class HW_5_6_QuickSort {

    public static void main(String args[]) {                            // Driver program
        int arr[] = {10, 7, 13, 9, 17, 5, 99, 121, 57, 63};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Array: " + arr[i] + " ");
        }
        System.out.println();

        HW_5_6_QuickSort quickSort = new HW_5_6_QuickSort();
        quickSort.sort(arr, 0, n - 1);

        System.out.print("sorted array: ");
        printArray(arr);
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);                                 // index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];                         // swap arr[i] and arr[j]
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];                               // swap arr[i+1] and arr[high] (or pivot)
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);            //pi is partitioning index, arr[pi] is now at right place

            sort(arr, low, pi - 1);                   // Recursively sort elements before partition and after partition
            sort(arr, pi + 1, high);
        }
    }

    static void printArray(int arr[]) {                                   /* A utility function to print array of size n */
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
