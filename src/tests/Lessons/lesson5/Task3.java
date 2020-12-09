package L5;
// 2. Write program which create
//array from 20 integers with random values
//Print the array values per line
//Find the maximum of array values
//Compute the average of all elements
//Reverse elements in array
//Copy all elements to other array
//Exchange 2 elements by indexes
public class Task3 {

  public static void main(String[] args) {
    int[] arr = new int[11];
    for (int i=0; i< arr.length; i++){
      arr[i] = (int) (Math.random() * 100);
      System.out.print(arr[i] + " ");
    }

//    double max = Double.NEGATIVE_INFINITY;
//    for (int i=0; i < arr.length; i++){
//      if (arr[i] > max){
//        max = arr[i];
//      }
//    }
//    System.out.println("\nmax=" + max);
//
//    double sum = 0;
//    for (int i=0; i < arr.length; i++){
//      sum += arr[i];
//    }
//    System.out.println("avg = " + sum / arr.length);
//
//    for(int i = 0; i < arr.length/2; i++){
//      int temp = arr[i];
//      arr[i] = arr[arr.length - 1 -i];
//      arr[arr.length - 1 -i] = temp;
//    }
//    for (int i=0; i< arr.length; i++){
//      System.out.print(arr[i] + " ");
//    }

//    int[] brr = exchangeElements(1,4, arr);
//    System.out.println();
//    for (int i=0; i< brr.length; i++){
//      System.out.print(brr[i] + " ");
//    }
//
//  }
//
//  static int[] exchangeElements(int x1, int x2, int[] arr1){
//    int temp = arr1[x1];
//    arr1[x1] = arr1[x2];
//    arr1[x2] = temp;
//    return arr1;
  }

}
