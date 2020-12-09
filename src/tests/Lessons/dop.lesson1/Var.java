package L2;

public class Var {
    public static void main(String[] args) {
        int myNum = 5;
        Integer myNum2 = 5;

        System.out.println(myNum2.toString());
        double myNum3 = 1.05;
        System.out.println(myNum3);
        char myLetter = 'D';
        char myLetter2 = 255;
        System.out.println(myLetter);
        System.out.println(myLetter2);
        boolean myBool;
        boolean myBool2 = true;
        String myString = "text";
        String myString2 = new String("text2");

        System.out.println(myString2);
        System.out.println(myString + " " + myString2 + " " + myLetter);
        System.out.printf("%s some text %d", myString, myNum2);
    }
}
