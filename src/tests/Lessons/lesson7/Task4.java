package L7;

// Given three strings A, B and C. Write a function that checks whether C is an interleaving of A and B.
public class Task4 {

  public static void main(String[] args) {
    String a = "AB";
    String b = "CD";
    String c1 = "ACBD";
    String c2 = "CABD";
    String c3 = "ABCD";
    String c4 = "ACDB";
    if (isInterleaved(a, b, c1) == true) {
      System.out.printf("\n%s is interleaved of %s and %s", c1, a, b);
    } else {
      System.out.printf("\n%s is not interleaved of %s and %s", c1, a, b);
    }
//    if (isInterleaved(a, b, c2) == true) {
//      System.out.printf("\n%s is interleaved of %s and %s", c2, a, b);
//    } else {
//      System.out.printf("\n%s is not interleaved of %s and %s", c2, a, b);
//    }
//    if (isInterleaved(a, b, c3) == true) {
//      System.out.printf("\n%s is interleaved of %s and %s", c3, a, b);
//    } else {
//      System.out.printf("\n%s is not interleaved of %s and %s", c3, a, b);
//    }
//    if (isInterleaved(a, b, c4) == true) {
//      System.out.printf("\n%s is interleaved of %s and %s", c4, a, b);
//    } else {
//      System.out.printf("\n%s is not interleaved of %s and %s", c4, a, b);
//    }
  }

  private static boolean isInterleaved(String a, String b, String c) {
    int i = 0, j = 0, k = 0;
    while (k != c.length()) {
      if (i < a.length() && a.charAt(i) == c.charAt(k)) {
        i++;
      } else if (j < b.length() && b.charAt(j) == c.charAt(k)) {
        j++;
      } else {
        return false;
      }
      k++;
    }
    if (i < a.length() || j < b.length()) {
      return false;
    }
    return true;
  }


}
