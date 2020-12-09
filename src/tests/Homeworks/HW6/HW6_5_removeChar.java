package tests.HW6;
//Write a Java program to read a string and an int from console, return a string without the character with described index
//The initial strings is: Hello buddy
//The numbers is: 3
//The new string is: Helo buddy

public class HW6_5_removeChar {
    public static void main(String[] args) {
        String text = "Hello buddy";
        int indexNumber = 0;
        System.out.println("The initial string is " + text);

        String textFirstPart = extractFirstPart(text, indexNumber);
        int newN = text.length() - indexNumber - 1;
        String textSecondPart = extractSecondPart(text, newN);
        System.out.println("The new string is " + textFirstPart + textSecondPart);
    }

    private static String extractFirstPart(String text, int charIndex) {
        return text.substring(0, charIndex);
    }

    private static String extractSecondPart(String text, int charIndex) {
        return text.substring(text.length() - charIndex);
    }
}


// Second case:
//public static void main(String[] args) {
//    Scanner input  = new Scanner(System.in);
//    System.out.print("Enter the string: ");
//    String str = input.nextLine();
//    System.out.print("Enter the number: ");
//    int number = input.nextInt();
//
//    deleteCharFromString(str, number);
//}
//    private static void deleteCharFromString(String str, int number) {
//        StringBuilder sb = new StringBuilder(str);
//
//        if (number > sb.length()){
//            System.out.println("You number is higher than string length");
//        } else {
//            for (int i = 0; i < str.length(); i++) {
//                if (number - 1 == i) {
//                    sb.deleteCharAt(i);
//                    System.out.println(sb);
//                    break;
//                }
//            }
//        }
