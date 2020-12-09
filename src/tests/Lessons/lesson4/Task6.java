package L4;
// 6. Write a program that take n from user for the size (a non-negative integer in int); and prints the following square pattern.
//Output->
//Enter the size: 5
//# # # # #
//# # # # #
//# # # # #
//# # # # #
//# # # # #
public class Task6 {

  public static void main(String[] args) {
    int n = 5;
    for (int i=0; i<=n; i++){
      for(int j=0; j<=n; j++){
        System.out.print("# ");
      }
      System.out.println();
    }
  }

}
