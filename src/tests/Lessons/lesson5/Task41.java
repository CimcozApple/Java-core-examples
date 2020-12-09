package L5;
// 4.1 Bubble Sort. The principle of bubble sort is to scan the elements from left-to-right,
// and whenever two adjacent elements are out-of-order, they are swapped. Repeat the passes
// until no swap are needed.
public class Task41 {
  static int l = 0;
  public static void main(String[] args) {
    int arr[] = {3, 60, 35, 2, 45, 320, 5};
    for (int i=0; i< arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    bubbleSort(arr);
    for (int i=0; i< arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println("\nl=" + l);
  }

  static void bubbleSort(int[] arr){
    int n = arr.length;
    int temp = 0;
    for (int i=0; i < n; i++){
      for(int j=1; j < n - i ; j++){
        if (arr[j-1] > arr[j]) {
          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
        l++;
      }
    }
  }
}
