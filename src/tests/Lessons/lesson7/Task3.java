package L7;

// Write a program which compares 2 strings by symbols and print whether they contain the same symbols or not.
// If not print difference. (Big and small symbol consider like the same)
//Output >>
//First string: Body_moving
//Second string: My body is fat
//Result: Strings contain different symbols.
//1st doesn’t contain ‘s’,’f’,’a’,t’
//2nd doesn’t contain ‘_’,’v’,’n’,d’
public class Task3 {

  public static void main(String[] args) {
    String firstString = "Body_moving";
    String secondString = "My body is fat";
    firstString = firstString.toLowerCase();
    secondString = secondString.toLowerCase();

    if (firstString.compareToIgnoreCase(secondString) != 0) {
      System.out.println("Result: Strings contain different symbols:");
      System.out.println("1st doesn't contains: ");
      for (int i = 0; i < firstString.length(); i++) {
        boolean flag = false;
        for (int j = 0; j < secondString.length(); j++) {
          if (firstString.charAt(i) == secondString.charAt(j)){
            flag = true;
            break;
          }
        }
        if (!flag){
          System.out.print("\'" + firstString.charAt(i) + "\'");
        }
      }
      System.out.println();
      System.out.println("2st doesn't contains: ");
      for (int i = 0; i < secondString.length(); i++) {
        boolean flag = false;
        for (int j = 0; j < firstString.length(); j++) {
          if (secondString.charAt(i) == firstString.charAt(j)){
            flag = true;
            break;
          }
        }
        if (flag == false && secondString.charAt(i) != ' '){
          System.out.print("\'" + secondString.charAt(i) + "\'");
        }
      }
    } else {
      System.out.println("2 strings contain same symbols");
    }
  }
}
