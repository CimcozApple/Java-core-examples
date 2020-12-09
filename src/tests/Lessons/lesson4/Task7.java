package L4;
// 7. Write a program that print out chess board (int i = 8 by default)
//Output ->
//# # # # # # #
// # # # # # # #
//# # # # # # #
// # # # # # # #
//# # # # # # #
// # # # # # # #
//# # # # # # #
public class Task7 {
  public static void main(String[] args) {
    int n = 5;
    for (int i=0; i<=n; i++){
      if (i % 2 != 0){
        System.out.print(" ");
      }
      for(int j=0; j<=n; j++){
        System.out.print("# ");
      }
      System.out.println();
    }
  }
}
