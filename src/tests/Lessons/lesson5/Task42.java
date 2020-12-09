package L5;

// 4.2 Selection Sort. This algorithm divides the lists into two parts:
// the left-sublist of items already sorted, and the right-sublist for the remaining items.
// Initially, the left-sorted-sublist is empty, while the right-unsorted-sublist is the entire
// list. The algorithm proceeds by finding the smallest (or largest) items from the
// right-unsorted-sublist, swapping it with the leftmost element of the right-unsorted-sublist,
// and increase the left-sorted-sublist by one.
public class Task42 {

  public static void main(String[] args) {
    int arr[] = {3, 60, 35, 2, 45, 320, 5};
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    selectionSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void selectionSort(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n - 1; i++){
      int minValueId = i;
      for(int j  = i + 1; j < n; j++){
        if (arr[j] < arr[minValueId]){
          minValueId = j;
        }
        int temp = arr[minValueId];
        arr[minValueId] = arr[i];
        arr[i] = temp;
      }
    }
  }
}
